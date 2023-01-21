package com.example.demo.enums;

public enum Equipment {
    CNC("CNC Machine"),
    MILLING("Milling Machine");

    private String value;

    Equipment(String value) {
        this.value = value;
    }
}
