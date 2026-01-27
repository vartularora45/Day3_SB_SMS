package com.example.SpringProject1.SpringBootProject1.Service;

import com.example.SpringProject1.SpringBootProject1.Model.StudentModel;
import com.example.SpringProject1.SpringBootProject1.Repository.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepo repo;

    public StudentService(StudentRepo repo) {
        this.repo = repo;
    }

    public StudentModel addStudent(StudentModel student) {
        return repo.save(student);
    }

    public List<StudentModel> getStudent(){
        return repo.findAll();
    }

    public StudentModel updateStudent(Long id, StudentModel  newStudent) {

        StudentModel existing = repo.findById(String.valueOf(id))
                .orElseThrow(() -> new RuntimeException("Student not found"));

        existing.setName(newStudent.getName());
        existing.setEmail(newStudent.getEmail());
        existing.setAge(newStudent.getAge());

        return repo.save(existing);
    }

    public StudentModel deleteStudent(String id) {


        repo.deleteById(id);
        return null;
    }





}

