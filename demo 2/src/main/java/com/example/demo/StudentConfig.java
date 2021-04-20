package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudent(){
        List<Student> myList = new ArrayList<>();
        Student lena=new Student(101, "Lena");
        myList.add(lena);
        Student kelly=new Student(102, "Kelly");
        myList.add(kelly);
        Student ashley=new Student(103, "Ashley");
        myList.add(ashley);
        Student theresa=new Student(104, "Theresa");
        myList.add(theresa);
        Student monali=new Student(105,"Monali");
        myList.add(monali);
        Student hazel=new Student(106, "Hazel");
        myList.add(hazel);
        Students finalList=new Students(myList);
        return finalList;

    }

    @Bean(name = "previousStudents")
    public Students previousStudents() {
        List<Student> previousCohort = new ArrayList<>();
        Student dasha = new Student(201, "Dasha");
        previousCohort.add(dasha);
        Student eugene = new Student(202, "Eugene");
        previousCohort.add(eugene);
        Student raul = new Student(203, "Raul");
        previousCohort.add(raul);
        Students previousList=new Students(previousCohort);
        return previousList;
    }
}
