package com.kevcode.testautomation.service.impl;

import com.kevcode.testautomation.model.entity.City;
import com.kevcode.testautomation.model.http.base.Response;
import com.kevcode.testautomation.model.http.dto.CityDto;
import com.kevcode.testautomation.model.http.request.CityRequest;
import com.kevcode.testautomation.model.http.request.CityUpdateRequest;
import com.kevcode.testautomation.repository.ICityRepository;
import com.kevcode.testautomation.service.ICityService;
import com.kevcode.testautomation.service.impl.base.IBaseService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service implementation of {@link ICityService}
 *
 * @author Kevin Pontón
 */
@Service
public class CityService implements ICityService, IBaseService {
    private final ICityRepository cityRepository;
    private final ModelMapper modelMapper;

    public CityService(ICityRepository cityRepository,
                       ModelMapper modelMapper) {
        this.cityRepository = cityRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Response<List<CityDto>> findAll() {
        try {
            List<City> cities = cityRepository.findAll();
            List<CityDto> cityDtoList = modelMapper.map(cities, new TypeToken<List<CityDto>>() {
            }.getType());
            return new Response<>(cityDtoList, HttpStatus.OK, "Ciudades encontradas: ", true);
        } catch (Exception e) {
            return new Response<>(null, HttpStatus.OK, AN_ERROR_HAPPENED_MESSAGE, false);
        }
    }

    @Override
    public Response<CityDto> getById(Integer id) {
        try {
            City city = cityRepository.findById(id).orElse(null);
            if (city == null) new Response<>(null, HttpStatus.BAD_REQUEST, "Ciudad no encontrada: ", false);
            CityDto cityDto = modelMapper.map(city, CityDto.class);
            return new Response<>(cityDto, HttpStatus.OK, "Ciudad encontrada: ", true);
        } catch (Exception e) {
            return new Response<>(null, HttpStatus.OK, AN_ERROR_HAPPENED_MESSAGE, false);
        }
    }

    @Override
    public Response<CityDto> save(CityRequest cityRequest) {
        try {
            City city = modelMapper.map(cityRequest, City.class);
            if (cityRepository.existsByName(cityRequest.getName()))
                return new Response<>(null, HttpStatus.BAD_REQUEST, "Ciudad ya existe", false);
            city = cityRepository.save(city);
            CityDto cityDto = modelMapper.map(city, CityDto.class);
            return new Response<>(cityDto, HttpStatus.OK, "Ciudad registrada: ", true);
        } catch (Exception e) {
            return new Response<>(null, HttpStatus.OK, AN_ERROR_HAPPENED_MESSAGE, e);
        }
    }

    @Override
    public Response<CityDto> update(CityUpdateRequest cityUpdateRequest) {
        try {
            if (!this.getById(cityUpdateRequest.getId()).isSuccess())
                return this.getById(cityUpdateRequest.getId());
            City city = modelMapper.map(cityUpdateRequest, City.class);
            cityRepository.save(city);
            CityDto cityDto = modelMapper.map(city, CityDto.class);
            return new Response<>(cityDto, HttpStatus.OK, "Ciudad actualizada: ", true);
        } catch (Exception e) {
            return new Response<>(null, HttpStatus.OK, AN_ERROR_HAPPENED_MESSAGE, false);
        }
    }
}
