package com.hms.service;

import com.hms.model.Medicine;

public interface MedicineService {
   Medicine save(Medicine medicine);

   Iterable<Medicine> findAll();

   Medicine updateMedicineById(long id, Medicine medicine);

   Medicine findMedicineById(long id);

   void deleteMedicineById(long id);
}
