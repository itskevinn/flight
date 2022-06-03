package com.kevcode.testautomation.model.http.request;

import com.kevcode.testautomation.model.http.dto.CityDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Update request entity for City
 *
 * @author Kevin Pontón
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CityUpdateRequest extends CityDto {
}
