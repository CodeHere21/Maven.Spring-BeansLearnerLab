package com.example.demo;

public class Student extends Person implements Learner{

    Double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
    }


    @Override
    public void learn(double numberOfHours) {
    totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime(){
        return totalStudyTime;
    }

}
