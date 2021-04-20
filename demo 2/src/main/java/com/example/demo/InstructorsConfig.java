package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InstructorsConfig {

    @Primary
    @Bean(name = "instructors")
    public Instructors instructors(){
        List<Instructor> instructorList= new ArrayList<>();
        Instructor dolio = new Instructor(301,"Dolio");
        instructorList.add(dolio);
        Instructor kris = new Instructor(302, "Kris");
        instructorList.add(kris);
        Instructors result=new Instructors(instructorList);
        return result;
    }

    @Bean(name = "tcUsaInstructors()")
    public Instructors tcUsaInstructors(){
        List<Instructor> instructorList= new ArrayList<>();
        Instructor dan = new Instructor(303,"Dan");
        instructorList.add(dan);
        Instructor pat = new Instructor(304, "Pat");
        instructorList.add(pat);
        Instructors result=new Instructors(instructorList);
        return result;
    }

    @Bean(name = "tcUkInstructors()")
    public Instructors tcUkInstructors(){
        List<Instructor> instructorUkList= new ArrayList<>();
        Instructor liz = new Instructor(305,"Liz");
        instructorUkList.add(liz);
        Instructor lossie = new Instructor(306, "Lossie");
        instructorUkList.add(lossie);
        Instructors result=new Instructors(instructorUkList);
        return result;
    }
}
