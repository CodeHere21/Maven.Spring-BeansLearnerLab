package com.example.demo;

import com.fasterxml.jackson.databind.util.ArrayIterator;

import java.util.ArrayList;

public class Instructor extends Person implements Teacher {
    Iterable<? extends Learner> learners;
    public Instructor(long id, String name){
        super(id, name);
        learners=new ArrayList<>();
    }
    private int getSize(Iterable<? extends Learner> learners){
        int size=0;
        for(Learner learner:learners){
            size++;
        }
        return size;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
       learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        for (Learner learner : learners) {
             teach(learner,numberOfHours/getSize(learners));
        }

    }
}
