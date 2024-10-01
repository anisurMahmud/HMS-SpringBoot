package com.hms.service;

import com.hms.model.Medicine;
import com.hms.model.User;
import com.hms.model.VisitHistory;
import com.hms.repository.MedicineRepository;
import com.hms.repository.UserRepository;
import com.hms.repository.VisitHistoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitHistoryServiceImpl implements VisitHistoryService {

    private final VisitHistoryRepository visitHistoryRepository;
    private final UserRepository userRepository;
    private final MedicineRepository medicineRepository;
    public VisitHistoryServiceImpl(
            VisitHistoryRepository visitHistoryRepository,
            UserRepository userRepository,
            MedicineRepository medicineRepository) {
        this.visitHistoryRepository = visitHistoryRepository;
        this.userRepository = userRepository;
        this.medicineRepository = medicineRepository;
    }

    @Override
    public VisitHistory addVisitHistory(VisitHistory visitHistory) {
        User user = userRepository.findById(visitHistory.getUser().getId())
                .orElseThrow(()-> new RuntimeException("User Not Found"));
        for(Medicine medicine : visitHistory.getMedicines()) {
            medicineRepository.findById(medicine.getId())
                    .orElseThrow(()->new RuntimeException("Medicine Not Found"));
        }
        visitHistory.setUser(user);
//        visitHistory.setMedicines();
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
