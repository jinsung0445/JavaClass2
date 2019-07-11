package org.dimigo.oop2;

public class CarTest {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("제네시스"),
                new Car("펠리세이드"),
                new Car("그랜저")
        };
//        Car.setCompany("현대");

        for(Car car : cars){
            System.out.println(car);
        }

        System.out.println(Integer.parseInt("100"));
        System.out.println(Math.abs(-123));
        System.out.println(Math.log10(100000000));
    }
}
