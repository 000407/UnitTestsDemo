package com.hsenid.japan.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class ApiResponse {
    protected StatusCode statusCode;
}
