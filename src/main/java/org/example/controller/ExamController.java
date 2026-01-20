package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.bto.ExamDto;
import org.example.sevice.ExamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exam")
@RequiredArgsConstructor
public class ExamController {

    final ExamService examService;

    @PostMapping("/add")
    void addExam(@RequestBody ExamDto examDto){
        examService.add(examDto);
    }
    @PostMapping("/update")
    void updateExam(@RequestBody ExamDto examDto){
        examService.update(examDto);
    }
    @DeleteMapping("/delete/{id}")
    void deleteExam(@PathVariable Integer id){
        examService.deleteById(id);
    }
    @GetMapping("/get-all")
    List<ExamDto> getAll(){
        return examService.getAll();
    }
    @GetMapping("/get-by-id")
    ExamDto getById(Integer id){
        return examService.getById(id);
    }
}
