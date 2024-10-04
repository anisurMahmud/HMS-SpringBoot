package com.hms.service;

import com.hms.dto.VisitHistoryResponseDTO;
import com.hms.model.VisitHistory;

import java.util.List;

public interface VisitHistoryService {
    VisitHistory addVisitHistory(VisitHistory visitHistory);

    List<VisitHistoryResponseDTO> getAllVisitHistory();

    VisitHistoryResponseDTO getVisitHistoryById(int id);
}
