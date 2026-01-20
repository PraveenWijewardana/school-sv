package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.bto.ClassDto;
import org.example.bto.ExamDto;
import org.example.sevice.ClassService;
import org.example.sevice.ExamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/class")
@RequiredArgsConstructor
public class ClassController {
    final ClassService classService;

    @PostMapping("/add")
    void addExam(@RequestBody ClassDto classDto){
        classService.add(classDto);
    }
    @PostMapping("/update")
    void updateExam(@RequestBody ClassDto classDto){
        classService.update(classDto);
    }
    @DeleteMapping("/delete/{id}")
    void deleteExam(@PathVariable Integer id){
        classService.deleteById(id);
    }
    @GetMapping("/get-all")
    List<ClassDto> getAll(){
        return classService.getAll();
    }
    @GetMapping("/get-by-id")
    ClassDto getById(Integer id){
        return classService.getById(id);
    }
}
