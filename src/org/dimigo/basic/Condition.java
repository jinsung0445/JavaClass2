package org.dimigo.basic;

import java.util.Random;

public class Condition {
    public static void main(String[] args) {

        //if ~ else
        //선거권 연령 : 만 19세
        int age = 17;

        //19세 이상이면 "투표 ㄱ" 아니면 "선거권 없음"

        if(age >17) {
            System.out.printf("투표 ㄱ");
        }
        else System.out.printf("선거권 없음음");

        //주사위 랜덤 뽑기
        System.out.println(new Random().nextInt(6)+1);
        int num = new Random().nextInt(6)+1;
        System.out.println(num);

        //switch문으로 num이 짝수면 "짝수" 홀수면 '홀수'

        switch (num%2){

            case 0:
                System.out.println("짝수");
                break;
            case 1:
                System.out.println("홀수임");
                break;
            case 2:
                System.out.println("응아니야");
        }

        String menu = "떡볶이";

        switch(menu) {
            case "떡볶이":
                System.out.println("떡볶이임 ㅇㅇ");
                break;
            case "순대":
                System.out.println("순대임 ㅇㅇ");
                break;
                default:
                    System.out.println("응 아니야");

        }


    }
}
