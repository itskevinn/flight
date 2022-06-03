package com.kevcode.testautomation.service.resources;

import com.kevcode.testautomation.model.entity.City;
import com.kevcode.testautomation.model.http.base.Response;
import com.kevcode.testautomation.model.http.dto.CityDto;
import com.kevcode.testautomation.model.http.request.CityRequest;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;

public class CityData {
    public static Response<List<CityDto>> getCityResponse() {
        List<CityDto> cityDtoList = new ArrayList<>();
        CityDto cityDto = new CityDto();
        cityDto.setId(1);
        cityDto.setName("Santa Marta");
        cityDtoList.add(cityDto);
        return new Response<>(cityDtoList, HttpStatus.OK, "Ciudad encontrada", true);
    }

    public static City getCity() {
        City city = new City();
        city.setId(1);
        city.setName("Valledupar");
        return city;
    }

    public static Response<CityDto> getOneCityResponse() {
        CityDto cityDto = new CityDto();
        cityDto.setId(1);
        cityDto.setName("Santa Marta");
        return new Response<>(cityDto, HttpStatus.OK, "Mensaje de respuesta", true);
    }

    public static CityRequest getCityRequest() {
        CityRequest cityRequest = new CityRequest();
        cityRequest.setName("Valledupar");
        return cityRequest;
    }
}
