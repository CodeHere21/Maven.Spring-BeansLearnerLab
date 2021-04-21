//package com.example.demo;
//
//import org.junit.Assert;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static org.junit.jupiter.api.Assertions.*;
//@RunWith(SpringRunner.class)
//@SpringBootTest
//class AlumniTest {
//
//    @Autowired
//    @Qualifier("previousStudents")
//    private Students previousStudents;
//
//    @Autowired
//    @Qualifier("instructors")
//    Instructors instructors;
//    @Test
//    void executeBootcamp() {
//    Alumni alumni =new Alumni();
//            for (Student s: alumni.getPreviousStudents()) {
//                Assert.assertEquals(1200.0, s.getTotalStudyTime(),.01);
//            }
//        }
//
//
//}