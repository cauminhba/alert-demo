package com.example.demo.entity;

import com.example.demo.enums.Anomaly;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Alert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private LocalDateTime time;
    private String normalClip;
    private String abnormalClip;
    @Enumerated(EnumType.STRING)
    private Anomaly anomaly;
    @OneToOne(fetch = FetchType.EAGER)
    private Machine machine;
}
