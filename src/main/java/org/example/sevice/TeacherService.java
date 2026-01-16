package org.example.sevice;

import org.example.bto.TeacherDto;

import java.util.List;

public interface TeacherService {
    void add(TeacherDto teacherDto);
    void upadte(TeacherDto teacherDto);
    void deleteById(Integer id);
    List<TeacherDto> getAll();
    TeacherDto getById(Integer id);
}
