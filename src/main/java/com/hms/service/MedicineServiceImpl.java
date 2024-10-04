package com.hms.service;

import com.hms.dto.MedicineResponseDTO;
import com.hms.model.Medicine;
import com.hms.repository.MedicineRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class MedicineServiceImpl implements MedicineService {

    private final MedicineRepository medicineRepository;

    public MedicineServiceImpl(MedicineRepository medicineRepository) {
        this.medicineRepository = medicineRepository;
    }

    @Override
    public Medicine save(Medicine medicine) {
        return medicineRepository.save(medicine);
    }

    @Override
    public List<MedicineResponseDTO> findAll() {
        List<Medicine> medicine = medicineRepository.findAll();
        return medicine.stream().map(medicine1 -> {
            MedicineResponseDTO dto = new MedicineResponseDTO();
            dto.setMedicineId(medicine1.getId());
            dto.setMedicineName(medicine1.getName());
            dto.setMedicineType(medicine1.getType());
            dto.setMedicineStock(medicine1.getStock());
            return dto;
        }).collect(Collectors.toList());
    }

    @Override
    public Medicine updateMedicineById(long id, Medicine medicine) {
        Medicine currentMedicine = medicineRepository.findById(id).get();
        if(Objects.nonNull(medicine.getType()) && !"".equalsIgnoreCase(medicine.getType()) ) {
            currentMedicine.setType(medicine.getType());
        }
        else if(Objects.nonNull(medicine.getName()) && !"".equalsIgnoreCase(medicine.getName()) ) {
            currentMedicine.setName(medicine.getName());
        }
        else if(medicine.getStock() >= 0) {
            currentMedicine.setStock(medicine.getStock());
        }

        return medicineRepository.save(currentMedicine);
    }

    @Override
    public MedicineResponseDTO findMedicineById(long id) {
        Medicine medicine = medicineRepository.findById(id).get();
        MedicineResponseDTO dto = new MedicineResponseDTO();
        dto.setMedicineId(medicine.getId());
        dto.setMedicineName(medicine.getName());
        dto.setMedicineType(medicine.getType());
        dto.setMedicineStock(medicine.getStock());
        return dto;
    }

    @Override
    public void deleteMedicineById(long id) {
        medicineRepository.deleteById(id);
    }
}
