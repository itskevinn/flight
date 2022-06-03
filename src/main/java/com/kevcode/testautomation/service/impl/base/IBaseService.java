package com.kevcode.testautomation.service.impl.base;

/**
 * This interface is used to define rules or attributes that all services of {@link com.kevcode.testautomation.service}
 * must have
 *
 * @author Kevin Pontón
 */
public interface IBaseService {
    /**
     * This attribute is used to reduce the code boilerplate in exception catching.
     *
     * @author Kevin Pontón
     */
    String AN_ERROR_HAPPENED_MESSAGE = "Ha ocurrido un error";
}
