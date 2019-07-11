package org.dimigo.oop;

import java.util.*;

public class SnackTest {
   public static int temp = 0;

    public static void main(String[] args) {

        Snack[] snackArr = new Snack[]{
                new Snack("새우깡", "농심", 1100, 2),
                new Snack("콘칲","크라운",1200,1),
                new Snack("허니버터칩", "해태", 1500, 4)

        };

        for(Snack value : snackArr) {
            System.out.println(value.toString());
            temp+= value.calPrice();
        }

        System.out.printf("총 구매 금액 : %,d원" , temp);

    }

    private static void printArray(Snack[] snackArr) {

    }


}
