package org.dimigo.inheritance2;

public class PersonTest {
    public static void main(String[] args) {
        Person a = new Person("Tom");

        Korean k = new Korean("홍길동");

        Japanese j = new Japanese("다나카");

        Chinese c = new Chinese("왕밍");

        System.out.println(a);
        System.out.println(k);
        System.out.println(j);
        System.out.println(c);
        System.out.println();

        a.sayHello();
        k.sayHello();
        j.sayHello();
        c.sayHello();
        System.out.println();

        a.sayBye();
        k.sayBye();
        j.sayBye();
        c.sayBye();
    }
}
