package org.dimigo.basic;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        //for 문제 구구단

        for(int i = 2; i<10; i++){
            for(int j =1; j<10; j++){
                System.out.printf("%d x %d = %d ", i,j,(i*j));
            }
            System.out.println();
        }


        //for each
        int[] arr = {1,2,3,4,5};
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        for(int temp : arr){
            System.out.print(temp + " ");
        }

        // ITZY 멤버 출력

        String[] Idol = {"예지", "유나", "채령", "류진", "리아"};
        for(String idol : Idol){
            System.out.print(idol + " ");
        }


        //while문 과 do while 문
        //메뉴  처리

        Scanner scanner = new Scanner(System.in);
        int menu = 0;

        do{
            System.out.println("<< 간식 선택 >>");
            System.out.println("1. 귀가");
            System.out.println("2. 금요귀가");
            System.out.println("3. 전체귀가");
            System.out.println("9. 종료");
            System.out.print("메뉴 선택 => ");

            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("귀가임");
                    break;
                case 2:
                    System.out.println("금요귀가임");
                    break;
                case 3:
                    System.out.println("전체귀가임");
                    break;
                case 9 :
                    System.out.println("종료임");
                    scanner.close();
                    break;
                default:
                    System.out.println("잔류해라");
                    break;

            }

        }while(menu !=9);


    }

}
