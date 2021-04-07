package com.company;

import java.util.HashMap;
import java.util.Map;

import static com.company.Gender.FEMALE;
import static com.company.Gender.MALE;
import static com.company.Person.COUNT;

public class HashMapDemo {


    public static void main(String[] args) {

        Person p1= new Person("Иванна", "Грекова", FEMALE);
        Person p2 = new Person("Даниил", "Гутник", MALE);
        Person p3 = new Person("Зоя", "Белявская", FEMALE);
        Person p4 = new Person("Александр", "Плахотский", MALE);
        Person p5 = new Person("Киррил", "Орлов", FEMALE);

        Map<Person, Integer> Persons = new HashMap<>();
        Persons.put(p1, 1);
        Persons.put(p2, 2);
        Persons.put(p3, 3);
        Persons.put(p4, 4);
        Persons.put(p5, 5);

        outputCollection(Persons);

    }

    public static void outputCollection(Map<Person, Integer> map) {
        System.out.println("Вывод: ");
        COUNT=0;
        for (Map.Entry<Person, Integer> keyValuePair : map.entrySet()) {
            System.out.println(keyValuePair.getKey() + " - " + keyValuePair.getValue());
            COUNT++;
        }
        System.out.println("Всего элементов  в коллекции: "+COUNT);
        System.out.println();
    }
}
