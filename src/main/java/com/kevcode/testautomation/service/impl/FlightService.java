package com.kevcode.testautomation.service.impl;

import com.kevcode.testautomation.model.http.base.Response;
import com.kevcode.testautomation.model.http.dto.FlightDto;
import com.kevcode.testautomation.model.http.request.FlightRequest;
import com.kevcode.testautomation.model.http.request.FlightUpdateRequest;
import com.kevcode.testautomation.service.IFlightService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * {@link IFlightService} implementation
 *
 * @author Kevin Pontón
 */
@Service
public class FlightService implements IFlightService {
    @Override
    public Response<List<FlightDto>> getAll() {
        return null;
    }

    @Override
    public Response<FlightDto> getById(Integer id) {
        return null;
    }

    @Override
    public Response<FlightDto> create(FlightRequest cityRequest) {
        return null;
    }

    @Override
    public Response<FlightDto> update(FlightUpdateRequest cityUpdateRequest) {
        return null;
    }
}
