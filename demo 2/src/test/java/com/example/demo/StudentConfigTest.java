package com.example.demo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class StudentConfigTest {

    @Test
    void currentStudent() {
        //Given
        List<Student> myList = new ArrayList<>();
        Student lena=new Student(101, "Lena");
        myList.add(lena);
        Students students  = new Students(myList);
        //When
        String expected = "Lena";
        String actual = students.findById(101).getName();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    void previousStudents() {
        //Given
        List<Student> previousCohort = new ArrayList<>();
        Student dasha = new Student(201, "Dasha");
        previousCohort.add(dasha);
        Students previousStudents=new Students(previousCohort);
        //When
        String expected ="Dasha";
        String actual = previousStudents.findById(201).getName();
        //Then
        Assert.assertEquals(expected, actual);
    }
}