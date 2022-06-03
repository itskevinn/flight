package com.kevcode.testautomation.model.entity;

import com.kevcode.testautomation.model.entity.base.EntityBase;

import javax.persistence.Entity;

/**
 * Entity City
 *
 * @author Kevin Pontón
 */
@Entity
public class City extends EntityBase {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
