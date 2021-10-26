package com.zahid.person;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PersonPriorityQueue {
    public static void main(String[] args) {
        Queue<Person> personQueue = new PriorityQueue<>();
        personQueue.offer(new Person("Alex", 19));
        personQueue.offer(new Person("Lee", 29));
        personQueue.offer(new Person("Cooper", 31));
        personQueue.offer(new Person("John", 25));
        personQueue.offer(new Person("Doe", 32));
        personQueue.offer(new Person("Jane", 32));

        System.out.println("# Printing using toString()");
        System.out.println(personQueue);
        System.out.println();
        
        // printing using for..each
        System.out.println("# Printing using for..each");
        for(Person person: personQueue) {
            System.out.println(person);
        }
        System.out.println();
        
        // printing using iterator
        System.out.println("# Printing using iterator");
        Iterator<Person> it = personQueue.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();
        
        // printing using peek & poll
        System.out.println("# Printing using peek() & poll()");
        while (!personQueue.isEmpty()) {
            System.out.println(personQueue.peek());
            personQueue.poll();
        }
        System.out.println();

    }
}
