package com.example.demo.service;

import com.example.demo.dto.AlertRequest;
import com.example.demo.dto.AlertResponse;
import com.example.demo.exception.NoDataFoundException;
import com.example.demo.mapper.AlertMapper;
import com.example.demo.repository.AlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlertService {

    public static final String NOT_FOUND_ALERT_FOR_ID_MSG = "Not Found Alert for Id: ";
    public static final String ANONYMOUS = "anonymous";
    @Autowired
    private AlertRepository alertRepository;

    @Autowired
    private AlertMapper alertMapper;


    public List<AlertResponse> getListAlert() {
        return alertRepository.findAll().stream()
                .map(x -> alertMapper.mapToAlertDto(x)).collect(Collectors.toList());
    }

    public AlertResponse getAlertById(Long id) {
        var alert = alertRepository.findById(id)
                .orElseThrow(() -> new NoDataFoundException(NOT_FOUND_ALERT_FOR_ID_MSG + id));
        return alertMapper.mapToAlertDto(alert);
    }

    public AlertResponse updateAlertById(AlertRequest alertRequest) {
        var alert = alertRepository.findById(alertRequest.getId())
                .orElseThrow(() -> new NoDataFoundException(NOT_FOUND_ALERT_FOR_ID_MSG + alertRequest.getId()));

        alert.getMachine().setSuspectedReason(alertRequest.getSuspectedReason());
        alert.getMachine().setActionRequired(alertRequest.getActionRequired());
        alert.getMachine().setComment(alertRequest.getComment());
        alert.getMachine().setCommentBy((alertRequest.getCommentBy() != null) ? alertRequest.getCommentBy() : ANONYMOUS);

        return alertMapper.mapToAlertDto(
                alertRepository.save(alert)
        );
    }
}
