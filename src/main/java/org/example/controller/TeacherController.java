package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.bto.TeacherDto;
import org.example.sevice.TeacherService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
@RequiredArgsConstructor
public class TeacherController {

    final TeacherService teacherService;

    @PostMapping("/add")
    void add(@RequestBody TeacherDto teacherDto){
        teacherService.add(teacherDto);
    }
    @PostMapping("/update")
    void update (@RequestBody TeacherDto teacherDto){
        teacherService.upadte(teacherDto);
    }
    @DeleteMapping("/delete-by-id/{id}")
    void deleteById(@PathVariable Integer id){
        teacherService.deleteById(id);
    }
    @GetMapping("/get-all")
    List<TeacherDto> getAll(){
        return teacherService.getAll();
    }
    @GetMapping("/get-by-id/{id}")
    TeacherDto getById(@PathVariable Integer id){
        return teacherService.getById(id);
    }
}
