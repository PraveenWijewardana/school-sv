package org.example.sevice;

import org.example.bto.ClassDto;
import org.example.bto.ExamDto;

import java.util.List;

public interface ClassService {
    void add(ClassDto classDto);
    void update(ClassDto classDto);
    void deleteById(Integer id);
    List<ClassDto> getAll();
    ClassDto getById(Integer id);
}
