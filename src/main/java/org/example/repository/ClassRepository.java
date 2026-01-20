package org.example.repository;

import org.example.entity.ClassEntity;
import org.example.entity.ExamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<ClassEntity,Integer> {
}
