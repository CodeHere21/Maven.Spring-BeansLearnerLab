package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {
    @Bean
    @Qualifier("currentCohort")
    @DependsOn({"instructors","students"})
    public Classroom currentCohort(Instructors instructors, Students students){
        Classroom newClassroom = new Classroom(instructors, students);
        return newClassroom;
    }

    @Bean
    @Qualifier("previousCohort")
    @DependsOn({"instructors","students"})
    public Classroom previousCohort(Instructors instructors, Students previousStudents){
        Classroom prevClassroom = new Classroom(instructors, previousStudents);
        return prevClassroom;
    }


}
