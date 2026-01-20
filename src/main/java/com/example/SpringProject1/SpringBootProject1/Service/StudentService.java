package com.example.SpringProject1.SpringBootProject1.Service;

import com.example.SpringProject1.SpringBootProject1.Model.StudentModel;
import com.example.SpringProject1.SpringBootProject1.Repository.StudentRepo;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepo repo;

    public StudentService(StudentRepo repo) {
        this.repo = repo;
    }

    public StudentModel addStudent(StudentModel student) {
        return repo.save(student);
    }
}

