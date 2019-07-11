package org.dimigo.oop;

import com.sun.jdi.Bootstrap;

public class ArrayBasic {
    public static void main(String[] args) {
        //기본형 : int , long, double, char, float, boolean, short
        //참조형 : String, Book, Car, Scanner, Random, StringBuilder
        Book book = null;
        Car car = null;

        int[] intArr = null;
        intArr = new int[5] ;

        printArray(intArr);

        //double 타입 5개짜리 배열 생성 후 출력
        double[] doubleArr = null;
        doubleArr = new double[5];
        for(double value2 : doubleArr) {
            System.out.print(value2 + "");
        }
        System.out.println();

        //배열 선언 시 초기화
        printArray2();
        int[] intArr3 = new int[] {1,2,3,4,5};

        // book 타입 2개짜리 배열 생성
        //각 방에 Book 객체 생성 후 출력

        Book[] bookArr = new Book[2];
        bookArr[0] = new Book("수학의 바이블", "김재영", 100);
        bookArr[1] = new Book("워드마스터", "전유원", 200);


        printArray(bookArr);

        Book[] bookArr2 = new Book[] {
                new Book("수학의 바이블", "김재영", 100),
                 new Book("워드마스터", "전유원", 200)
        };
        printArray(bookArr2);
    }

    private static void printArray(Book[] bookArr) {
        for(Book value : bookArr) {
            System.out.println(value);
        }
    }

    private static void printArray2() {
        int[] intArr2 = {1,2,3,4,5};
    }

    String[] strArr5 = null;


    private static void printArray(int[] intArr) {


//        for(int value : intArr) {
//            System.out.print(value + "");
//        }
//        System.out.println();
//
//        //참조형 배열
//        String[] strArr = new String[3];
//        printArray(strArr);
//
//        strArr[0] = "BTS";
//        strArr[1] = "EXO";
//        strArr[2] = "볼빨간사춘기";
//        printArray(strArr);
//
//        String[] strArr2 = {"BTS", "EXO",  "볼빨간사춘기"};
//        String[] strArr3 = new String[] {"BTS", "EXO",  "볼빨간사춘기"};
//
//        printArray(strArr2);
//
//
//        double[] doubleArr = new double[5];
//        printArray(doubleArr);
//        for(double d : doubleArr){
//            System.out.print(d + "");

        }



    private static void printArray(double[] doubleArr) {
    }
}
