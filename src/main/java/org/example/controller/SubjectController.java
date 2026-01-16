package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.bto.SubjectDto;
import org.example.sevice.SubjectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subject")
@RequiredArgsConstructor
public class SubjectController {

    final SubjectService subjectService;

    @PostMapping("/add")
    void addSubject(@RequestBody SubjectDto subjectDto){
        subjectService.add(subjectDto);
    }
    @PostMapping("/update")
    void updateSubject(@RequestBody SubjectDto subjectDto){
        subjectService.update(subjectDto);
    }
    @DeleteMapping("/delete-by-id/{id}")
    void deleteSubjectById(@PathVariable Integer id){
        subjectService.deleteById(id);
    }
    @GetMapping("/get-all")
    List<SubjectDto> getAll(){
        return subjectService.getAll();
    }
}
