package com.kevcode.testautomation.model.http.base;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class Response<T> {

    private T body;
    private String message;
    private String exceptionString;
    private HttpStatus httpStatusCode;
    private boolean success;

    public Response() {

    }

    public Response(T body, HttpStatus status, String message, boolean success) {
        this.message = message;
        this.body = body;
        this.httpStatusCode = status;
        this.success = success;
    }

    public Response(T body, HttpStatus status, String message,Exception exception) {
        this.message = message;
        this.body = body;
        this.httpStatusCode = status;
        this.success = false;
        if (exception.getCause() != null) {
            this.exceptionString = exceptionToString(exception);
        }
    }

    public String exceptionToString(Exception exception) {
        return "An exception occurred in " + exception.getClass().getSimpleName() +
                ", in the line " + exception.getCause().getStackTrace()[0].getLineNumber() +
                ": " + exception.getMessage();
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getExceptionString() {
        return exceptionString;
    }

    public void setExceptionString(String exceptionString) {
        this.exceptionString = exceptionString;
    }

    public HttpStatus getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(HttpStatus httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

}
