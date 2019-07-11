package org.dimigo.oop;

public class CarTest2 {
    public static void main(String[] args) {
        CarMake2 car;

        car = new CarMake2();
        CarMake2 car2 = new CarMake2();

        System.out.println(" << 자동차 목록 >> ");
        CarMake2 car3 = new CarMake2("현대자동차", "제네시스", " 검정색", 225,50000000);
        CarMake2 car4 = new CarMake2("기아자동차", "K7", "흰색", 246,40000000);
        CarMake2 car5 = new CarMake2("삼성자동차", "SM7", "회색", 200,38000000);

        System.out.printf("제조사명 : %s\n" , car3.getCompany());
        System.out.printf("모델명 : %s\n" , car3.getModel());
        System.out.printf("색상 : %s\n" , car3.getColor());
        System.out.printf("최대속도 : %dKM\n" , car3.getMaxSpeed());
        System.out.printf("가격 : %,d원\n", car3.getPrice());
        System.out.println("");

        System.out.printf("제조사명 : %s\n" , car4.getCompany());
        System.out.printf("모델명 : %s\n" , car4.getModel());
        System.out.printf("색상 : %s\n" , car4.getColor());
        System.out.printf("최대속도 : %dKM\n" , car4.getMaxSpeed());
        System.out.printf("가격 : %,d원\n", car4.getPrice());
        System.out.println("");

        System.out.printf("제조사명 : %s\n" , car5.getCompany());
        System.out.printf("모델명 : %s\n" , car5.getModel());
        System.out.printf("색상 : %s\n" , car5.getColor());
        System.out.printf("최대속도 : %dKM\n" , car5.getMaxSpeed());
        System.out.printf("가격 : %,d원\n", car5.getPrice());
        System.out.println("");

    }
}
