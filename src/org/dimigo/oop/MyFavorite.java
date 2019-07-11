package org.dimigo.oop;

import java.util.Scanner;

public class MyFavorite {
    public static int check = 0;
    public static int intValue;
    public static void main(String[] args) {
        String[] questions={
            "가장 좋아하는 가수는?",
            "가장 좋아하는 배우는?",
            "가장 좋아하는 과목은?"
        };

        String[] answers={
          "아이유",
          "원빈",
          "자료구조"
        };

        Scanner scanner = new Scanner(System.in);
        int input;

        while(true){
            System.out.println("------------------");
            System.out.println("1. 질문선택");
            System.out.println("2. 정답공개");
            System.out.println("9. 프로그램 종료");
            System.out.println("------------------");
            System.out.printf("메뉴 선택 =>");
            input = scanner.nextInt();
            switch(input){
                case 1:
                    double randomValue = Math.random();
                    intValue = (int)(randomValue*3);
                    System.out.println(questions[intValue]);
                    String ans = scanner.next();
                    if(ans.equals(answers[intValue])) {
                        System.out.println("정답입니다.");
                    }
                    else {
                        System.out.println("오답입니다.");
                    }
                    break;
                case 2:
                    StringBuilder sb = new StringBuilder();
                    System.out.println(" << 정답 출력 >>");
                    for(int i = 0; i<3; i++){
                        sb.append(questions[i]).append(answers[i]).append("입니다\n");
                    }
                    System.out.println(sb);
                    break;

                case 9:
                    System.out.printf("Bye ~");
                    System.exit(0);

            }

        }







    }
}
