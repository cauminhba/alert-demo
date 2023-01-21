package com.example.demo.dto;

import com.example.demo.enums.ActionRequired;
import com.example.demo.enums.Anomaly;
import com.example.demo.enums.Equipment;
import com.example.demo.enums.SuspectedReason;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlertResponse {
    private Long id;
    private String title;
    private Date time;
    private Equipment equipment;
    private Anomaly anomaly;
    private SuspectedReason suspectedReason;
    private ActionRequired actionRequired;
    private String normalSoundClip;
    private String anomalySoundClip;
    private AlertComment alertComment;
}
