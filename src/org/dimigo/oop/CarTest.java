package org.dimigo.oop;

import java.util.*;


public class CarTest {
    public static void main(String[] args) {
        CarMake car;

        car = new CarMake();
        CarMake car2 = new CarMake();

        System.out.println(" << 자동차 목록 >> ");


        System.out.printf("제조사명 : ");
        System.out.println(car.getCompany());
        System.out.printf("모델명 : ");
        System.out.println(car.getModel());
        System.out.printf("색상 : ");
        System.out.println(car.getColor());
        System.out.printf("최대속도 : ");
        System.out.printf("%dKM\n", car.getMaxSpeed());
        System.out.printf("가격 : ");
        System.out.printf("%,d원\n" , car.getPrice());
        System.out.println("");

        car.setCompany("기아자동차");
        car.setModel("K7");
        car.setColor("흰색");
        car.setMaxSpeed(246);
        car.setPrice(40000000);

        System.out.printf("제조사명 : ");
        System.out.println(car.getCompany());
        System.out.printf("모델명 : ");
        System.out.println(car.getModel());
        System.out.printf("색상 : ");
        System.out.println(car.getColor());
        System.out.printf("최대속도 : ");
        System.out.printf("%dKM\n", car.getMaxSpeed());
        System.out.printf("가격 : ");
        System.out.printf("%,d원\n" , car.getPrice());
        System.out.println("");

        car2.setCompany("삼성자동차");
        car2.setModel("SM7");
        car2.setColor("회색");
        car2.setMaxSpeed(200);
        car2.setPrice(38000000);

        System.out.printf("제조사명 : ");
        System.out.println(car2.getCompany());
        System.out.printf("모델명 : ");
        System.out.println(car2.getModel());
        System.out.printf("색상 : ");
        System.out.println(car2.getColor());
        System.out.printf("최대속도 : ");
        System.out.printf("%dKM\n", car2.getMaxSpeed());
        System.out.printf("가격 : ");
        System.out.printf("%,d원\n" , car2.getPrice());
        System.out.println("");
    }
}

