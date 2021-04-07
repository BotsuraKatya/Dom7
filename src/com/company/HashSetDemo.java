package com.company;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.company.Gender.FEMALE;
import static com.company.Gender.MALE;
import static com.company.Person.COUNT;

public class HashSetDemo {

    public static void main(String[] args) {
        Person p1 = new Person("Иванна", "Грекова", FEMALE);
        Person p2 = new Person("Александр", "Плахотский", MALE);
        Person p3 = new Person("Киррил", "Орлов", FEMALE);
        Person p4 = new Person("Александр", "Плахотский", MALE);
        Person p5 = new Person("Киррил", "Орлов", FEMALE);


        Set<Person> Person = new HashSet<>();
        Person.add(p1);
        Person.add(p2);
        Person.add(p3);
        Person.add(p4);
        Person.add(p5);

        outputCollection(Person);


    }

    public static void outputCollection(Set<Person> set) {
        System.out.println();
        COUNT=0;
        for (Person number : set) {
            System.out.println(number + " ");
            COUNT++;
        }
        System.out.println("Всего элементов  в коллекции: "+COUNT);
        System.out.println();
    }

}
