package org.example.sevice.impl;

import lombok.RequiredArgsConstructor;
import org.example.bto.SubjectDto;
import org.example.entity.SubjectEntity;
import org.example.repository.SubjectRepository;
import org.example.sevice.SubjectService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {

    final SubjectRepository repository;

    @Override
    public void add(SubjectDto subjectDto) {
        SubjectEntity  subjectEntity = new SubjectEntity();
        subjectEntity.setName(subjectDto.getName());
        subjectEntity.setCategory(subjectDto.getCategory());
        repository.save(subjectEntity);
    }

    @Override
    public void update(SubjectDto subjectDto) {
        SubjectEntity subjectEntity = new SubjectEntity();
        subjectEntity.setId(subjectDto.getId());
        subjectEntity.setName(subjectDto.getName());
        subjectEntity.setCategory(subjectDto.getCategory());
        repository.save(subjectEntity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<SubjectDto> getAll() {
        List<SubjectEntity> list = repository.findAll();
        List<SubjectDto> subjectDtos = new ArrayList<>();

        list.forEach(subjectEntity -> {
            SubjectDto subjectDto = new SubjectDto();
            subjectDto.setId(subjectEntity.getId());
            subjectDto.setName(subjectEntity.getName());
            subjectDto.setCategory(subjectEntity.getCategory());
            subjectDtos.add(subjectDto);
        });
        return subjectDtos;
    }
}
