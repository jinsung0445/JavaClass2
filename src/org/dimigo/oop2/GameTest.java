package org.dimigo.oop2;

public class GameTest {
    public static void main(String[] args) {
        MediaPlayer mp = MediaPlayer.getInstance();
        System.out.println(mp.getVoulume());

        new Player().play();
        System.out.println(mp.getVoulume());
        new Enemy().play();
        System.out.println(mp.getVoulume());
    }
}
