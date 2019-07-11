package org.dimigo.inheritance;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("아이유", 26,162,48);
        System.out.println(p);
        p.eat();
        p.sleep();

        Student s = new Student();
        System.out.println(s);
        s.eat();
        s.sleep();
        s.studyAtNight();



        Teacher t= new Teacher("야야수",30,190,150);
        System.out.println(t);
        t.eat();
        t.sleep();
        t.teach();

    }
}
