package com.kevcode.testautomation.controller;

import com.kevcode.testautomation.service.IFlightService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/flight")
public class FlightController {
    private final IFlightService flightService;

    public FlightController(IFlightService flightService) {
        this.flightService = flightService;
    }
}
