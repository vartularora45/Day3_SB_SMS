package com.example.SpringProject1.SpringBootProject1.Controller;

import com.example.SpringProject1.SpringBootProject1.Model.StudentModel;
import com.example.SpringProject1.SpringBootProject1.Repository.StudentRepo;
import com.example.SpringProject1.SpringBootProject1.Service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController  {
    private final StudentService service;
    private final StudentRepo studentRepo;

    public StudentController(StudentService service, StudentRepo studentRepo) {
        this.service = service;
        this.studentRepo = studentRepo;
    }
    //create function api


    @PostMapping("/add-student")
    public StudentModel addStudent(@RequestBody StudentModel student){
        return service.addStudent(student);
    }
}

