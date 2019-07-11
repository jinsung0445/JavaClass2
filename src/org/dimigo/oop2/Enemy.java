package org.dimigo.oop2;


public class Enemy {
    public void play() {
        MediaPlayer mp = MediaPlayer.getInstance();
        mp.setVoulume(mp.getVoulume() + 10);
    }
}
