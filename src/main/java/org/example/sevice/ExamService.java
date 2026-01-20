package org.example.sevice;

import org.example.bto.ExamDto;

import java.util.List;

public interface ExamService {
    void add(ExamDto examDto);
    void update(ExamDto examDto);
    void deleteById(Integer id);
    List<ExamDto> getAll();
    ExamDto getById(Integer id);
}
