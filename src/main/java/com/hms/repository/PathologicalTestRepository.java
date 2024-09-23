package com.hms.repository;

import com.hms.model.PathologicalTest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PathologicalTestRepository extends JpaRepository<PathologicalTest, Long> {
}
