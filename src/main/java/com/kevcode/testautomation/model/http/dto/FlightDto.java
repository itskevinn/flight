package com.kevcode.testautomation.model.http.dto;

import com.kevcode.testautomation.model.http.request.FlightRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * DTO for entity Flight
 *
 * @author Kevin Pontón
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FlightDto extends FlightRequest {
    private Integer id;
}
