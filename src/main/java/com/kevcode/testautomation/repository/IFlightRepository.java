package com.kevcode.testautomation.repository;

import com.kevcode.testautomation.model.entity.City;
import com.kevcode.testautomation.model.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JPA Repository for entity {@link Flight}
 *
 * @author Kevin Pontón
 */
public interface IFlightRepository extends JpaRepository<Flight, City> {
}
