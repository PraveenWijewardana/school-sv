package org.example.sevice.impl;

import lombok.RequiredArgsConstructor;
import org.example.bto.ExamDto;
import org.example.entity.ExamEntity;
import org.example.repository.ExamRepository;
import org.example.sevice.ExamService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ExamServiceImpl  implements ExamService {

    final ModelMapper modelMapper;
    final ExamRepository repository;

    @Override
    public void add(ExamDto examDto) {
        ExamEntity examEntity = modelMapper.map(examDto, ExamEntity.class);
        repository.save(examEntity);
    }

    @Override
    public void update(ExamDto examDto) {
        ExamEntity examEntity = modelMapper.map(examDto,ExamEntity.class);
        repository.save(examEntity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<ExamDto> getAll() {
        List<ExamEntity> list =repository.findAll();
        List<ExamDto> examDtos = new ArrayList<>();
        list.forEach(examEntity -> {
            ExamDto examDto = modelMapper.map(examEntity,ExamDto.class);
            examDtos.add(examDto);
        });
        return examDtos;
    }

    @Override
    public ExamDto getById(Integer id) {
        return null;
    }
}
