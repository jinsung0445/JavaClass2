package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {

        //1.list 계열 : ArrayList

        //제네릭(Generic)
        List<String> list = new ArrayList<>();
        list.add("사과");
        list.add("배");
        list.add("딸기");
        list.add("앙기모띠");
        list.add(1, "포도");
        printList(list);
        list.set(2, "바나나");
        printList(list);

        System.out.println(list.get(0));
        System.out.println(list.get(list.size() - 1 ));

        list.remove(0);
        printList(list);

        list.remove("딸기");
        printList(list);

        list.clear();
        printList(list);

    }

    private static void printList(List<String> list) {
        for(String value : list) {
            System.out.print(value + "|");
        }
        System.out.println();
    }

}

