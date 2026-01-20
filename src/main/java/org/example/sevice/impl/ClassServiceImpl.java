package org.example.sevice.impl;

import lombok.RequiredArgsConstructor;
import org.example.bto.ClassDto;
import org.example.bto.ExamDto;
import org.example.entity.ClassEntity;
import org.example.entity.ExamEntity;
import org.example.repository.ClassRepository;
import org.example.repository.ExamRepository;
import org.example.sevice.ClassService;
import org.example.sevice.ExamService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClassServiceImpl implements ClassService {

    final ModelMapper modelMapper;
    final ClassRepository repository;

    @Override
    public void add(ClassDto classDto) {
        ClassEntity classEntity = modelMapper.map(classDto, ClassEntity.class);
        repository.save(classEntity);
    }

    @Override
    public void update(ClassDto classDto) {
        ClassEntity classEntity = modelMapper.map(classDto, ClassEntity.class);
        repository.save(classEntity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<ClassDto> getAll() {
        List<ClassEntity> list =repository.findAll();
        List<ClassDto> classDtos = new ArrayList<>();
        list.forEach(classEntity -> {
            ClassDto classDto = modelMapper.map(classEntity,ClassDto.class);
            classDtos.add(classDto);
        });
        return classDtos;
    }

    @Override
    public ClassDto getById(Integer id) {
        return null;
    }
}
