package org.dimigo.basic;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(" << 미림벅스 연간 월급여 >>");

        long a = 1700000;
        long b = 3;
        long c = 1500;

        long d = a*b*c*12;

        System.out.printf("월 평균 급여 : %,d원\n" , a);
        System.out.printf("점포 내 직원수 : %,d명\n", b);
        System.out.printf("점포 수 : %,d개\n\n" , c);

        System.out.printf("연간 인건비 : %,d원\n" ,d);

    }
}

