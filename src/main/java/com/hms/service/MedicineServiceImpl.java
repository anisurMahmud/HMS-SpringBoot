package com.hms.service;

import com.hms.model.Medicine;
import com.hms.repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicineServiceImpl implements MedicineService {

    @Autowired
    private MedicineRepository medicineRepository;

    @Override
    public Medicine save(Medicine medicine) {
        return medicineRepository.save(medicine);
    }
}
