package com.zahid.person;

import lombok.Data;

@Data
public class Person implements Comparable<Person> {
    private String name;
    private Integer age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // @Override
    // public int compareTo(Person o) {

    //     return this.age.compareTo(o.age);
    // }     
    
    @Override
    public int compareTo(Person o) {
        
        return o.age.compareTo(this.age);
    }

    @Override
    public String toString() {
        return name + "(" + age +")";
    } 

    
}
