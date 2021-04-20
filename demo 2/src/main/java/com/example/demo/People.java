package com.example.demo;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class People <PersonType extends Person> implements Iterable<PersonType> {

    List<PersonType> personList;

    public People(List<PersonType> personList) {
        this.personList = personList;
    }

    public void add(PersonType person){
        personList.add(person);

    }
    public void remove(PersonType person){
        personList.remove(person);
    }

    public int size(List<PersonType> personList){
        return personList.size();
    }

    public void clear(List<Person> personList){
        personList.clear();
    }

    public void addAll(Iterable<PersonType> personList){
        this.personList.addAll((Collection<? extends PersonType>) personList);
    }

    public PersonType findById (long id){
        for (PersonType person : personList){
            if (person.getId()==id){
                return person;
            }
        }
        return null;
    }

    public List<PersonType> findAll (){
   return personList;
    }

    @Override
    public Iterator<PersonType> iterator() {
        return null;
    }

}
