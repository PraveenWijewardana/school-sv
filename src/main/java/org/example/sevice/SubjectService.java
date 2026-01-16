package org.example.sevice;

import org.example.bto.SubjectDto;

import java.util.List;

public interface SubjectService {
    void add(SubjectDto subjectDto);
    void update(SubjectDto subjectDto);
    void deleteById(Integer id);
    List<SubjectDto> getAll();
}
