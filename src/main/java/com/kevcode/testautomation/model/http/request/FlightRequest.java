package com.kevcode.testautomation.model.http.request;

import com.kevcode.testautomation.model.entity.City;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Request for entity Flight
 *
 * @author Kevin Pontón
 */
@Data
public class FlightRequest {
    private LocalDateTime checkoutDate;
    private LocalDateTime checkinDate;
    private City departureCity;
    private City arriveCity;
}
