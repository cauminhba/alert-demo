package com.example.demo.enums;

public enum SuspectedReason {
    NORMAL("Normal"),
    AXIS_PROBLEM("Axis Problem"),
    SPINDLE_ERROR("Spindle Error"),
    ROUTER_FAULT("Axis Problem"),
    MACHINE_CRASH("Spindle Error");

    private String value;

    SuspectedReason(String value) {
        this.value = value;
    }
}
