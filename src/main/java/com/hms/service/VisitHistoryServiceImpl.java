package com.hms.service;

import com.hms.model.Medicine;
import com.hms.model.User;
import com.hms.dto.VisitHistoryResponseDTO;
import com.hms.model.VisitHistory;
import com.hms.repository.MedicineRepository;
import com.hms.repository.UserRepository;
import com.hms.repository.VisitHistoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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
        //visitHistory.setMedicines(medicineList);
        return visitHistoryRepository.save(visitHistory);
    }

    @Override
    public List<VisitHistoryResponseDTO> getAllVisitHistory() {
        List<VisitHistory> visitHistory = visitHistoryRepository.findAll();

        return visitHistory.stream().map(visitHistory1 -> {
            VisitHistoryResponseDTO dto = new VisitHistoryResponseDTO();
            dto.setId(visitHistory1.getId());
            dto.setDate(visitHistory1.getDate());
            dto.setUserId(visitHistory1.getUser().getId());
            dto.setUserName(visitHistory1.getUser().getName());
            dto.setMedicineId(visitHistory1.getMedicines().stream()
                    .map(Medicine::getId)
                    .collect(Collectors.toList()));
            return dto;
        })
                .collect(Collectors.toList());
    }

    @Override
    public VisitHistoryResponseDTO getVisitHistoryById(int id) {
        VisitHistory visitHistory = visitHistoryRepository.findById(id).get();
        VisitHistoryResponseDTO responseDTO = new VisitHistoryResponseDTO();
        responseDTO.setId(visitHistory.getId());
        responseDTO.setDate(visitHistory.getDate());
        responseDTO.setUserName(visitHistory.getUser().getName());
        responseDTO.setUserId(visitHistory.getUser().getId());
        responseDTO.setMedicineId(visitHistory.getMedicines().stream()
                .map(Medicine::getId)
                .collect(Collectors.toList()));

        return responseDTO;
    }

    @Override
    public void deleteVisitHistoryById(int id) {
        visitHistoryRepository.deleteById(id);
    }
}
