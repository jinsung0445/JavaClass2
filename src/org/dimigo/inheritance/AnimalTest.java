package org.dimigo.inheritance;

import org.dimigo.oop.Calculator;

public class AnimalTest  {
    public static void main(String[] args) {
        Animal a = new Animal("아무개");
        System.out.println(a);
        a.eat();
        a.sleep();
        a.bark();

        Dog d = new Dog("뽀삐");
        System.out.println(d);
        d.eat();
        d.bark();
        d.wag();
        d.sleep();

        Cat c = new Cat("길냥이");
        System.out.println(c);
        c.bark();
        c.scratch();
        c.eat();
        c.sleep();

        Tiger t = new Tiger("큰냥이");
        t.bark();
        t.hunt();
        t.eat();
        t.sleep();


        Animal d2 = new Dog("멍댕이");
        Animal c2 = new Cat("야야ㅣ");
        Animal t3 = new Tiger("어흥이");

        Animal[] animals = {
                new Dog ("멍댕이"),
                new Cat("야야ㅣ"),
                new Tiger("어흥이")
        };

        for(Animal animal : animals){
            System.out.println(animal);
            animal.eat();
            animal.sleep();
            animal.bark();
        }


        Animal a2 = new Cat("야옹이");
        Cat cat = (Cat) a2;

        cat.scratch();
        ((Cat) a2).scratch();

        Animal dog = new Dog("멍청이");
        System.out.println(c instanceof Cat);
        System.out.println(d instanceof Dog);
        System.out.println(t instanceof Tiger);
        System.out.println(dog instanceof Cat);
        System.out.println(dog instanceof Animal);



    }
}
