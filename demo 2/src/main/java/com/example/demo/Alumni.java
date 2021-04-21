package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;

public class Alumni {
    @Autowired
    @Qualifier("previousStudents")
    private Students previousStudents;

    @Autowired
     @Qualifier("instructors")
    Instructors instructors;

    public Students getPreviousStudents() {
        return previousStudents;
    }

    public Instructors getInstructors() {
        return instructors;
    }
    @PostConstruct
    public void executeBootcamp( ){
//        int numberOfInstructors = instructors.size();
//        int numberOfStudents = previousStudents.size();
//        double numberOfHoursToTeachEachStudent = 1200;
//        double numberOfHoursToTeach = numberOfHoursToTeachEachStudent * numberOfStudents;
//        double numberOfHoursPerInstructor = numberOfHoursToTeach / numberOfInstructors;
    for(Instructor instructor:instructors){
        instructor.lecture(previousStudents,(1200* 6/ 2));
    }
    }
}
