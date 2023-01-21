package com.example.demo.controller;


import com.example.demo.dto.AlertRequest;
import com.example.demo.dto.AlertResponse;
import com.example.demo.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlertController {

    @Autowired
    private AlertService alertService;

    @GetMapping("/alerts")
    public List<AlertResponse> getListAlert() {
        return alertService.getListAlert();
    }

    @GetMapping("/alerts/{id}")
    public AlertResponse getAlertById(@PathVariable("id") String id) {
        return alertService.getAlertById(Long.valueOf(id));
    }

    @PostMapping("/alerts/{id}")
    public AlertResponse updateAlertById(AlertRequest alertRequest) {
        return alertService.updateAlertById(alertRequest);
    }
}
