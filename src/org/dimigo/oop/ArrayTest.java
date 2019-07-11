package org.dimigo.oop;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        String[] src = { "서울", "광주", "부산", "경기", "대구"};


        System.out.println(Arrays.toString(src));

        //배열 복사
        String[] dest = Arrays.copyOf(src, src.length);
        System.out.println(Arrays.toString(dest));

        //배열 비교
        System.out.println(Arrays.equals(src , dest));

        //배열 정렬
        Arrays.sort(dest);
        System.out.println(Arrays.toString(dest));

        //배열 검색
        System.out.println(Arrays.binarySearch(dest, "인천"));
    }
}
