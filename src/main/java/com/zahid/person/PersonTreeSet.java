package com.zahid.person;

import java.util.Set;
import java.util.TreeSet;

public class PersonTreeSet {
    public static void main(String[] args) {
        Person p1 = new Person("Alex", 29);
        Person p2 = new Person("Lee", 26);
        Person p3 = new Person("Cooper", 30);
        Person p4 = new Person("John", 24);
        Person p5 = new Person("Doe", 24);
        Person p6 = new Person("Jane", 21);

        Set<Person> personSet = new TreeSet<>();
        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);
        personSet.add(p4);
        personSet.add(p5);
        personSet.add(p6);

        System.out.println(personSet);
    }
}
