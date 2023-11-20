package org.serhiienkoyurii;

import org.serhiienkoyurii.model.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Andrii", 2020));
        people.add(new Person("Mykola", 2002));

        people.add(new Person("Oleksandr", 2013));
        people.get(2).changeName("Ihor");

        Person personToSave = new Person();
        personToSave.input("Mykhailo", 2015);
        people.add(personToSave);

        personToSave = new Person("Evgen", 1998);
        people.add(personToSave);

        for(Person person : people){
           person.output();
        }
    }
}