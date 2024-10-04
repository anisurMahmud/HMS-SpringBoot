package com.hms.service;

import com.hms.dto.MedicineResponseDTO;
import com.hms.model.Medicine;

import java.util.List;

public interface MedicineService {
   Medicine save(Medicine medicine);

   List<MedicineResponseDTO> findAll();

   Medicine updateMedicineById(long id, Medicine medicine);

   MedicineResponseDTO findMedicineById(long id);

   void deleteMedicineById(long id);
}
