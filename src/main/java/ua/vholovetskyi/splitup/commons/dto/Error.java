package ua.vholovetskyi.splitup.commons.dto;

import org.springframework.http.HttpStatus;

public enum Error {

    NOT_FOUND(HttpStatus.NOT_FOUND, "%s with id: %s not found!"),
    EMAIL_ALREADY_EXISTS(HttpStatus.CONFLICT, "%s with id: %s already exists!");

    private final HttpStatus status;
    private final String message;

    Error(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }
}
