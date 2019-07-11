package org.dimigo.inheritance2;

import org.dimigo.inheritance.Animal;

public class PersonTest2 {
    public static void main(String[] args) {

        Person[] persons = {
                new Person("Tom"),
                new Korean("홍길동"),
                new Japanese("다나카"),
                new Chinese("왕밍")
        };


        for (Person person : persons) {
            System.out.println(person);
            person.sayHello();
            person.sayBye();
            System.out.println();
        }
    }
}
