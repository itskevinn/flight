package com.kevcode.testautomation.model.entity.base;

import javax.persistence.*;

/**
 * Base entity, so we can set attributes globally for domain entities, such as {@code status}
 *
 * @author Kevin Pontón
 */
@MappedSuperclass
public class EntityBase {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
