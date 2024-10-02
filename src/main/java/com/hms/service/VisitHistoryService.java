package com.hms.service;

import com.hms.model.VisitHistory;

import java.util.List;

public interface VisitHistoryService {
    VisitHistory addVisitHistory(VisitHistory visitHistory);

    List<VisitHistory> getAllVisitHistory();

    VisitHistory getVisitHistoryById(int id);
}
