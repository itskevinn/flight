package com.kevcode.testautomation.controller;

import com.kevcode.testautomation.model.http.base.Response;
import com.kevcode.testautomation.model.http.dto.CityDto;
import com.kevcode.testautomation.model.http.request.CityRequest;
import com.kevcode.testautomation.model.http.request.CityUpdateRequest;
import com.kevcode.testautomation.service.ICityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST Controller for managing cities
 *
 * @author Kevin Pontón
 */
@RestController
@RequestMapping("api/city")
public class CityController {
    private final ICityService cityService;

    public CityController(ICityService cityService) {
        this.cityService = cityService;
    }

    /**
     * {@code GET} method for getting all cities
     *
     * @return {@link Response}<{@link List}<{@link CityDto}>>
     * @author Kevin Pontón
     */
    @GetMapping("getAll")
    public Response<List<CityDto>> getAll() {
        return cityService.findAll();
    }

    /**
     * {@code GET} method for getting city by {@code id}
     *
     * @return {@link Response}<{@link CityDto}>
     * @author Kevin Pontón
     */
    @GetMapping("getById/{id}")
    public Response<CityDto> getById(@PathVariable Integer id) {
        return cityService.getById(id);
    }

    /**
     * {@code POST} method for saving a city
     *
     * @return {@link Response}<{@link CityDto}>
     * @author Kevin Pontón
     */
    @PostMapping("create")
    public Response<CityDto> create(@RequestBody CityRequest cityRequest) {
        return cityService.save(cityRequest);
    }

    /**
     * {@code PUT} method for updating a city
     *
     * @param cityUpdateRequest {@link CityUpdateRequest}
     * @return {@link Response}<{@link CityDto}>
     * @author Kevin Pontón
     */
    @PutMapping("update")
    public Response<CityDto> update(@RequestBody CityUpdateRequest cityUpdateRequest) {
        return cityService.update(cityUpdateRequest);
    }
}
