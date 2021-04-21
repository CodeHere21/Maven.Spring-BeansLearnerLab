package com.example.demo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.security.RunAs;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class InstructorsConfigTest {
    @Autowired
    @Qualifier("instructors")
    Instructors instructors;

    @Autowired
    @Qualifier("tcUsaInstructors")
    Instructors tcUsaInstructors;

    @Autowired
    @Qualifier("tcUkInstructors")
    Instructors tcUkInstructors;


    @Test
    void instructors() {
        // injection did all the jazz
        //
        //

        Assert.assertEquals("Dolio", instructors.findById(301).getName());
    }

    @Test
    void tcUsaInstructors() {
        Assert.assertEquals("Dan", tcUsaInstructors.findById(303).getName());
    }

    @Test
    void tcUkInstructors() {
        Assert.assertEquals("Liz",tcUkInstructors.findById(305).getName());
    }
}