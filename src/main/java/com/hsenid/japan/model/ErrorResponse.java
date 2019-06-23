package com.hsenid.japan.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse extends ApiResponse {
    private StatusCode statusCode = StatusCode.I500;
    private String message;
    private Throwable cause;
}
