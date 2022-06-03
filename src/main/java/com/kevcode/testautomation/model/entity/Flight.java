package com.kevcode.testautomation.model.entity;

import com.kevcode.testautomation.model.entity.base.EntityBase;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

/**
 * Entity Flight
 *
 * @author Kevin Pontón
 */
@Entity
public class Flight extends EntityBase {
    private LocalDateTime checkoutDate;
    private LocalDateTime checkinDate;
    @ManyToOne
    private City departureCity;
    @ManyToOne
    private City arriveCity;

    public LocalDateTime getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(LocalDateTime checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public LocalDateTime getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(LocalDateTime checkinDate) {
        this.checkinDate = checkinDate;
    }

    public City getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(City departureCity) {
        this.departureCity = departureCity;
    }

    public City getArriveCity() {
        return arriveCity;
    }

    public void setArriveCity(City arriveCity) {
        this.arriveCity = arriveCity;
    }
}
