package com.yeoboge.server.enums.error;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum CommonErrorCode implements ErrorCode {
    NOT_FOUND(HttpStatus.NOT_FOUND, "Requested Resource Not Found");

    private final HttpStatus httpStatus;
    private final String message;
}
