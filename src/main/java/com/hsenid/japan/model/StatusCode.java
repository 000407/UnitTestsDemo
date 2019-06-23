package com.hsenid.japan.model;

public enum StatusCode {
    I500("Internal Error occurred"),
    S200("Success");

    private final String text;

    StatusCode(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return this.name();
    }
}
