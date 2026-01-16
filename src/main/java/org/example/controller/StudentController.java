package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.bto.StudentDto;
import org.example.sevice.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studen")
@RequiredArgsConstructor
public class StudentController {

    final StudentService studentService;

    @PostMapping("/add")
    void addStudent(@RequestBody StudentDto studentDto){
        studentService.add(studentDto);
    }

    @PostMapping("/update")
    void updateStudent(@RequestBody StudentDto studentDto){
        studentService.update(studentDto);
    }

    @DeleteMapping("/delete-by-id/{id}")
    void deleteStudent(@PathVariable Integer id){
        studentService.deleteById(id);
    }

    @GetMapping("/get-by-id/{id}")
    StudentDto getById(@PathVariable Integer id){
        return studentService.getById(id);
    }

    @GetMapping("/get-all")
    List<StudentDto> getAll(){
        return studentService.getAll();
    }

}
