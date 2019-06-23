package com.hsenid.japan.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DivisionResponse extends ApiResponse {
    private StatusCode statusCode = StatusCode.S200;
    private float result;
}
