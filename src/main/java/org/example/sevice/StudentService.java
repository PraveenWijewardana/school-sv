package org.example.sevice;

import org.example.bto.StudentDto;
import java.util.List;

public interface StudentService {
    void add(StudentDto studentDto);
    void update(StudentDto studentDto);
    void deleteById(Integer id);
    StudentDto getById(Integer id);
    List<StudentDto> getAll();
}
