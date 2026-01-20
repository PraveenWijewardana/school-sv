package org.example.repository;

import org.example.entity.ExamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<ExamEntity,Integer> {
}
