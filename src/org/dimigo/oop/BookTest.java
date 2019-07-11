package org.dimigo.oop;

import java.util.*;


public class BookTest {
    public static void main(String[] args) {
        Book book;

        book = new Book();
        Book book2 = new Book();

        System.out.println(book);
        System.out.println(book2);

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPage());

        book.setTitle("수학의 정석");
        book.setAuthor("홍성대");
        book.setPage(350);

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPage());

        Book book3 = new Book("Word Master","전유원", 400);
        System.out.println(book3.getTitle());
    }
}
