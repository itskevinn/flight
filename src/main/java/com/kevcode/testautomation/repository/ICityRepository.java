package com.kevcode.testautomation.repository;

import com.kevcode.testautomation.model.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JPA Repository for entity {@link City}
 *
 * @author Kevin Pontón
 */
public interface ICityRepository extends JpaRepository<City, Integer> {
    /**
     * Validate if a city exists by its name
     *
     * @return {@code boolean}
     */
    boolean existsByName(String name);
}
