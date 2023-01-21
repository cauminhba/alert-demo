package com.example.demo.dto;

import com.example.demo.enums.ActionRequired;
import com.example.demo.enums.SuspectedReason;
import lombok.Data;

@Data
public class AlertRequest {
    private Long id;
    private SuspectedReason suspectedReason;
    private ActionRequired actionRequired;
    private String comment;
    private String commentBy;
}
