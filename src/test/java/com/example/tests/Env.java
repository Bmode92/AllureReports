package com.example.tests;

public enum Env {

    BROWSER("chrome"),
    URL("http://example.com");

    private String value;

    Env(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
