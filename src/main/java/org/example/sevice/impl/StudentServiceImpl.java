package org.example.sevice.impl;

import lombok.RequiredArgsConstructor;
import org.example.bto.StudentDto;
import org.example.entity.StudentEntity;
import org.example.repository.StudentRepository;
import org.example.sevice.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    final StudentRepository repository;

    @Override
    public void add(StudentDto studentDto) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setName(studentDto.getName());
        studentEntity.setAddress(studentDto.getAddress());
        studentEntity.setClassRoom(studentDto.getClassRoom());
        studentEntity.setGander(studentDto.getGander());
        studentEntity.setPhone(studentDto.getPhone());
        repository.save(studentEntity);
    }

    @Override
    public void update(StudentDto studentDto) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setId(studentDto.getId());
        studentEntity.setName(studentDto.getName());
        studentEntity.setAddress(studentDto.getAddress());
        studentEntity.setClassRoom(studentDto.getClassRoom());
        studentEntity.setGander(studentDto.getGander());
        studentEntity.setPhone(studentDto.getPhone());
        repository.save(studentEntity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public StudentDto getById(Integer id) {
        StudentEntity studentEntity = repository.getById(id);
        StudentDto studentDto = new StudentDto();
        studentDto.setId(studentEntity.getId());
        studentDto.setName(studentEntity.getName());
        studentDto.setAddress(studentEntity.getAddress());
        studentDto.setClassRoom(studentEntity.getClassRoom());
        studentDto.setGander(studentEntity.getGander());
        studentDto.setPhone(studentEntity.getPhone());
        return studentDto;
    }

    @Override
    public List<StudentDto> getAll() {
        List<StudentEntity> list = repository.findAll();
        List<StudentDto> studentDtos = new ArrayList<>();

        list.forEach(studentEntity -> {
            StudentDto studentDto = new StudentDto();
            studentDto.setId(studentEntity.getId());
            studentDto.setName(studentEntity.getName());
            studentDto.setAddress(studentEntity.getAddress());
            studentDto.setClassRoom(studentEntity.getClassRoom());
            studentDto.setGander(studentEntity.getGander());
            studentDto.setPhone(studentEntity.getPhone());
            studentDtos.add(studentDto);
        });
        return studentDtos;
    }
}
