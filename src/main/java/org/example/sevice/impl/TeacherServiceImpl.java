package org.example.sevice.impl;

import lombok.RequiredArgsConstructor;
import org.example.bto.TeacherDto;
import org.example.entity.TeacherEntity;
import org.example.repository.TeacherRepository;
import org.example.sevice.TeacherService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {

    final TeacherRepository repository;

    @Override
    public void add(TeacherDto teacherDto) {
        TeacherEntity teacherEntity = new TeacherEntity();
        teacherEntity.setName(teacherDto.getName());
        teacherEntity.setAddress(teacherDto.getAddress());
        teacherEntity.setPhoneNumber(teacherEntity.getPhoneNumber());
        teacherEntity.setSubject(teacherDto.getSubject());
        repository.save(teacherEntity);
    }

    @Override
    public void upadte(TeacherDto teacherDto) {
        TeacherEntity teacherEntity = new TeacherEntity();
        teacherEntity.setId(teacherDto.getId());
        teacherEntity.setName(teacherDto.getName());
        teacherEntity.setAddress(teacherDto.getAddress());
        teacherEntity.setPhoneNumber(teacherEntity.getPhoneNumber());
        teacherEntity.setSubject(teacherDto.getSubject());
        repository.save(teacherEntity);
    }

    @Override
    public void deleteById(Integer id) {
        deleteById(id);
    }

    @Override
    public List<TeacherDto> getAll() {
        List<TeacherDto> teacherDtos = new ArrayList<>();
        List<TeacherEntity> list = repository.findAll();
        list.forEach(teacherEntity -> {
            TeacherDto teacherDto = new TeacherDto();
            teacherDto.setId(teacherEntity.getId());
            teacherDto.setName(teacherEntity.getName());
            teacherDto.setAddress(teacherEntity.getAddress());
            teacherDto.setPhoneNumber(teacherEntity.getPhoneNumber());
            teacherDto.setSubject(teacherEntity.getSubject());
            teacherDtos.add(teacherDto);
        });
        return teacherDtos;
    }

    @Override
    public TeacherDto getById(Integer id) {
        TeacherEntity teacherEntity = repository.findById(id).get();
        TeacherDto teacherDto = new TeacherDto();
        teacherDto.setId(teacherEntity.getId());
        teacherDto.setName(teacherEntity.getName());
        teacherDto.setAddress(teacherEntity.getAddress());
        teacherDto.setPhoneNumber(teacherEntity.getPhoneNumber());
        teacherDto.setSubject(teacherEntity.getSubject());
        return teacherDto;
    }
}
