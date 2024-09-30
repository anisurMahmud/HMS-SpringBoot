package com.hms.service;

import com.hms.model.VisitHistory;
import com.hms.repository.VisitHistoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitHistoryServiceImpl implements VisitHistoryService {

    private final VisitHistoryRepository visitHistoryRepository;

    public VisitHistoryServiceImpl(VisitHistoryRepository visitHistoryRepository) {
        this.visitHistoryRepository = visitHistoryRepository;
    }

    @Override
    public VisitHistory addVisitHistory(VisitHistory visitHistory) {
        return visitHistoryRepository.save(visitHistory);
    }

    @Override
    public List<VisitHistory> getAllVisitHistory() {
        return visitHistoryRepository.findAll();
    }

    @Override
    public VisitHistory getVisitHistoryById(int id) {
        return visitHistoryRepository.findById(id).get();
    }
}
