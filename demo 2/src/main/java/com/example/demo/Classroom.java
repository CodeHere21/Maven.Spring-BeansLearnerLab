package com.example.demo;

import java.util.ArrayList;

public class Classroom {
    Instructors instructors;
    Students students;

    public Classroom(Instructors instructors, Students students) {
        this.instructors = instructors;
        this.students = students;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public Students getStudents() {
        return students;
    }


    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(new ArrayList<>(10), numberOfHours);
    }
}
