package com.example.SpringProject1.SpringBootProject1.Controller;

import com.example.SpringProject1.SpringBootProject1.Model.StudentModel;
import com.example.SpringProject1.SpringBootProject1.Repository.StudentRepo;
import com.example.SpringProject1.SpringBootProject1.Service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/get")
    public List<StudentModel> getStudent(){
        return service.getStudent();
    }
   @PutMapping("/update/{id}")
    public StudentModel updateStudent(@PathVariable long id,@RequestBody StudentModel newStudent){
        return service.updateStudent(id,newStudent);
   }

   @DeleteMapping("/delete/{id}")
   public StudentModel deleteStudentbyid(@PathVariable long id){
        return service.deleteStudent(String.valueOf(id));
   }

}

