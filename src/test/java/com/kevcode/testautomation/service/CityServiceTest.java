package com.kevcode.testautomation.service;

import com.kevcode.testautomation.model.entity.City;
import com.kevcode.testautomation.model.http.base.Response;
import com.kevcode.testautomation.model.http.dto.CityDto;
import com.kevcode.testautomation.model.http.request.CityRequest;
import com.kevcode.testautomation.repository.ICityRepository;
import com.kevcode.testautomation.service.impl.CityService;
import com.kevcode.testautomation.service.resources.CityData;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;


import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CityServiceTest {
    @InjectMocks
    CityService cityService;
    @Mock
    ICityRepository cityRepository;
    @Mock
    ModelMapper modelMapper;

    @Test
    void shouldSavedCitySuccessfully() {
        City city = CityData.getCity();
        CityRequest cityRequest = CityData.getCityRequest();
        given(modelMapper.map(cityRequest, City.class))
                .willReturn(city);
        given(cityRepository.save(city)).willAnswer(invocation -> invocation.getArguments()[0]);
        Response<CityDto> savedCityResponse = cityService.save(cityRequest);
        assertThat(savedCityResponse.getHttpStatusCode()).isEqualTo(HttpStatus.OK);
        verify(cityRepository).save(any(City.class));
    }

    @Test
    void shouldReturnNullWhenSavingCityWithExistingName() {
        City city = CityData.getCity();
        CityRequest cityRequest = CityData.getCityRequest();
        given(modelMapper.map(cityRequest, City.class)).willReturn(city);
        given(cityRepository.existsByName(city.getName())).willReturn(true);
        Response<CityDto> cityDtoResponse = cityService.save(cityRequest);
        assertThat(cityDtoResponse.getBody()).isNull();
        verify(cityRepository, never()).save(any(City.class));
    }

    @Test
    void shouldReturnNullWhenGettingCityByIdThatDoesNotExists() {
        Integer id = 5;
        given(cityRepository.findById(id)).willReturn(null);
        Response<CityDto> cityDtoResponse = cityService.getById(id);
        assertThat(cityDtoResponse.getBody()).isNull();
    }

    @Test
    void shouldReturnCityById() {
        CityDto cityDto = new CityDto();
        City city = CityData.getCity();
        Integer id = 5;
        given(modelMapper.map(city, CityDto.class)).willReturn(cityDto);
        given(cityRepository.findById(id)).willReturn(Optional.of(city));
        Response<CityDto> cityDtoResponse = cityService.getById(id);
        assertThat(cityDtoResponse.getBody()).isNotNull();
    }


    @Test
    void shouldReturnCityUpdated() {
        CityDto cityDto = new CityDto();
    }

}
