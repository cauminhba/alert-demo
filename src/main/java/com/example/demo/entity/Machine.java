package com.example.demo.entity;


import com.example.demo.enums.ActionRequired;
import com.example.demo.enums.Equipment;
import com.example.demo.enums.SuspectedReason;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Machine {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String sensor;
    private LocalDateTime modifyTime;
    @Enumerated(EnumType.STRING)
    private Equipment equipment;
    @Enumerated(EnumType.STRING)
    private SuspectedReason suspectedReason;
    @Enumerated(EnumType.STRING)
    private ActionRequired actionRequired;
    private String comment;
    private String commentBy;
}