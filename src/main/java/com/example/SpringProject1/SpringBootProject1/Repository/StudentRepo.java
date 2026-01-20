package com.example.SpringProject1.SpringBootProject1.Repository;

import com.example.SpringProject1.SpringBootProject1.Model.StudentModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo  extends MongoRepository<StudentModel,String> {


}
