package com.company;
import java.util.ArrayList;
import java.util.List;

import static com.company.Gender.FEMALE;
import static com.company.Gender.MALE;
import static com.company.Person.COUNT;

public class ArrayListDemo {


   public static void main(String[] args) {

        Person p1= new Person("Иванна", "Грекова", FEMALE);
        Person p2 = new Person("Даниил", "Гутник", MALE);
        Person p3 = new Person("Зоя", "Белявская", FEMALE);
        Person p4 = new Person("Александр", "Плахотский", MALE);
        Person p5 = new Person("Киррил", "Орлов", FEMALE);

        ArrayList <Person > persons = new ArrayList <>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);


        outputCollection(persons);

        persons.remove(0);

        outputCollection(persons);

    }

    public static void outputCollection(List<Person> list) {
        System.out.println();
        COUNT=0;
        for (Person persons : list) {
            System.out.print(persons + " " );
            System.out.println();
            COUNT++;
        }
        System.out.println("Всего элементов  в коллекции: "+COUNT);
        System.out.println();
    }

}
