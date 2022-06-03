package com.kevcode.testautomation.model.http.request;

import com.kevcode.testautomation.model.http.dto.FlightDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class FlightUpdateRequest extends FlightDto {
}
