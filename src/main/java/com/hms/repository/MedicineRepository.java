package com.hms.repository;

import com.hms.model.Medicine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicineRepository extends CrudRepository<Medicine, Long> {
}
