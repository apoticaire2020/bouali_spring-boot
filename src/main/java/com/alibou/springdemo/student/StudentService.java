package com.alibou.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> studentList(){
     return   List.of(new Student("ali" ,"bouali",LocalDate.now() , "ali@yahoo.fr", 37)
                , new Student("omar" ,"zaydi", LocalDate.now() , "omar@yahoo.fr", 40));
    }

}
