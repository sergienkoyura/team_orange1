package org.serhiienkoyurii.model;

import java.util.Calendar;
import java.util.Date;

public class Person {
    private String name;
    private int birthYear;

    public Person() {
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public int findAge(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        return calendar.get(Calendar.YEAR) - birthYear;
    }

    public void input(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    public void changeName(String name){
        this.name = name;
    }

    public void output() {
        System.out.println(
                "Person {" +
                "\n\tname = '" + name + '\'' +
                ",\n\tbirthday year = " + birthYear +
                ",\n\tage = " + findAge() +
                "\n}"
        );
    }
}
