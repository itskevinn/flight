package com.kevcode.testautomation.service;

import com.kevcode.testautomation.model.http.base.Response;
import com.kevcode.testautomation.model.http.dto.CityDto;
import com.kevcode.testautomation.model.http.request.CityRequest;
import com.kevcode.testautomation.model.http.request.CityUpdateRequest;

import java.util.List;

/**
 * Service specification for City entity
 *
 * @author Kevin Pontón
 */
public interface ICityService {
    /**
     * Method for getting all cities
     *
     * @return {@link Response}<{@link List}<{@link CityDto}>>
     * @author Kevin Pontón
     */
    Response<List<CityDto>> findAll();

    /**
     * Method for getting city by {@code id}
     *
     * @param id {@link Integer}
     * @return {@link Response}<{@link CityDto}>
     * @author Kevin Pontón
     */
    Response<CityDto> getById(Integer id);

    /**
     * Method for creating a city
     *
     * @param cityRequest {@link CityRequest}
     * @return {@link Response}<{@link CityDto}>
     * @author Kevin Pontón
     */
    Response<CityDto> save(CityRequest cityRequest);

    /**
     * Method for updating a city
     *
     * @param cityUpdateRequest {@link CityUpdateRequest}
     * @return {@link Response}<{@link CityDto}>
     * @author Kevin Pontón
     */
    Response<CityDto> update(CityUpdateRequest cityUpdateRequest);
}
