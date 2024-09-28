package com.hms.service;

import com.hms.model.Medicine;
import com.hms.repository.MedicineRepository;
import org.springframework.stereotype.Service;

import java.util.Objects;

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
    public Iterable<Medicine> findAll() {
        return medicineRepository.findAll();
    }

    @Override
    public Medicine updateMedicineById(long id, Medicine medicine) {
        Medicine currentMedicine = medicineRepository.findById(id).get();
        if(Objects.nonNull(medicine.getType()) && !"".equalsIgnoreCase(medicine.getType()) ) {
            currentMedicine.setType(medicine.getType());
        }
        if(Objects.nonNull(medicine.getName()) && !"".equalsIgnoreCase(medicine.getName()) ) {
            currentMedicine.setName(medicine.getName());
        }
        if(medicine.getStock() >= 0) {
            currentMedicine.setStock(medicine.getStock());
        }

        return medicineRepository.save(currentMedicine);
    }

    @Override
    public Medicine findMedicineById(long id) {
        return medicineRepository.findById(id).get();
    }

    @Override
    public void deleteMedicineById(long id) {
        medicineRepository.deleteById(id);
    }
}
