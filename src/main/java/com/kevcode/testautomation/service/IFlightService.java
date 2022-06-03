package com.kevcode.testautomation.service;

import com.kevcode.testautomation.model.http.base.Response;
import com.kevcode.testautomation.model.http.dto.FlightDto;
import com.kevcode.testautomation.model.http.request.FlightRequest;
import com.kevcode.testautomation.model.http.request.FlightUpdateRequest;

import java.util.List;

/**
 * Service specification for Flight entity
 *
 * @author Kevin Pontón
 */
public interface IFlightService {
    /**
     * Method for getting all cities
     *
     * @return {@link Response}<{@link List}<{@link FlightDto}>>
     * @author Kevin Pontón
     */
    Response<List<FlightDto>> getAll();

    /**
     * Method for getting city by {@code id}
     *
     * @param id {@link Integer}
     * @return {@link Response}<{@link FlightDto}>
     * @author Kevin Pontón
     */
    Response<FlightDto> getById(Integer id);

    /**
     * Method for creating a city
     *
     * @param cityRequest {@link FlightRequest}
     * @return {@link Response}<{@link FlightDto}>
     * @author Kevin Pontón
     */
    Response<FlightDto> create(FlightRequest cityRequest);

    /**
     * Method for updating a city
     *
     * @param cityUpdateRequest {@link FlightUpdateRequest}
     * @return {@link Response}<{@link FlightDto}>
     * @author Kevin Pontón
     */
    Response<FlightDto> update(FlightUpdateRequest cityUpdateRequest);
}
