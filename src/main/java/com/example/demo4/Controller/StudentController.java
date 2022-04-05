package com.example.demo4.Controller;

import com.example.demo4.Entity.StudentEntity;
import com.example.demo4.Service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping
    public List <StudentEntity> findAllStudent() {
        return studentService.findAllStudent();
    }
    @GetMapping("/{id}")
    public Optional <StudentEntity> findStudentById (@PathVariable("id") Long id) {
        return studentService.findById(id);
    }
    @PostMapping
    public StudentEntity saveStudent (@RequestBody StudentEntity studentEntity) {
        return studentService.saveStudent(studentEntity);
    }
    @PutMapping
    public StudentEntity updateStudent(@RequestBody StudentEntity studentEntity) {
        return studentService.updateStudent(studentEntity);
    }
    @DeleteMapping("/{id}")
    public void deleteStudents (@PathVariable("id")Long id) {
        studentService.deleteStudent(id);
    }
}
