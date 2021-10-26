package com.zahid.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentListSort {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Alex"));
        studentList.add(new Student("Lee"));
        studentList.add(new Student("Cooper"));
        studentList.add(new Student("John"));
        studentList.add(new Student("Doe"));
        studentList.add(new Student("Jane"));

        System.out.println("# Before sorting: ");
        System.out.println(studentList);
        System.out.println();
        
        // //  using default sorting without any comparator
        // System.out.println("# After sorting (default): ");
        // Collections.sort(studentList);
        // System.out.println(studentList);
        // System.out.println();
        
        
        // // using anynmous inner class
        // System.out.println("# After sorting using anonymous inner class & comparator: ");
        // Collections.sort(studentList, new Comparator<Student>(){
            
        //     @Override
        //     public int compare(Student o1, Student o2) {
        //         return o1.getName().compareTo(o2.getName());
        //     }
            
        // });
        // System.out.println(studentList);
        // System.out.println();
        

        // using lambda function
        System.out.println("# After sorting using lambda & comparator: ");
        Collections.sort(studentList, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        System.out.println(studentList);
        System.out.println();
        
    }
}
