package com.example.demo.enums;

public enum ActionRequired {
    NO_ACTION("No Action"),
    IMMEDIATE("Immediate"),
    LATER("Later");

    private String value;
    ActionRequired(String value) {
        this.value = value;
    }
}
