package org.dimigo.basic;

public class Operator {
    public static void main(String[] args) {
        //1. 산술연산자
        int a =5, b= 2;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //2.5가 나오게 하려면?

        System.out.println((double)a / b);
//        System.out.println(a/0);

        int i = 10;
        double d = 3.14;
        int r1 = (int)(i+d);
        double r2 = i +d;

        short s1 = 1, s2 = 2;
        short r3 = (short)(s1 +s2);
        int r4 = s1 +s2;

        // Shot Circuit test

        boolean flag = true;
        a = 10;
        b = 0;

        if(flag || (a/b == 0)){
            System.out.println("구독 좋아요 감사합니다");
        }

        if(!flag && (a/b == 0)){
            System.out.println("구독 좋아요 감사합니당");
        }

        //문자열 연결 연산자

        String school = "디미고";
        int grade = 2;
        int ban = 5;
        String name = "김진성";

        System.out.println(school + grade + ban + name);
        System.out.println(grade + ban + school + name );

        // 25 디미고 김진성성
       System.out.println(grade + (ban + school) + name);




    }
}
