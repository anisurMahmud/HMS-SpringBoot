package com.hms.repository;

import com.hms.model.LabTest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabTestRepo  extends JpaRepository<LabTest, Integer> {
}
