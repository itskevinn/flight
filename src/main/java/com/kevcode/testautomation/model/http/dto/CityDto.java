package com.kevcode.testautomation.model.http.dto;

import com.kevcode.testautomation.model.http.request.CityRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * DTO for entity City
 *
 * @author Kevin Pontón
 */
@Data
public class CityDto {
    private Integer id;
    private String name;
}
