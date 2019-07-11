package org.dimigo.oop2;

public class MediaPlayer {
    private int voulume;

    private static MediaPlayer instance = new MediaPlayer();

    private MediaPlayer() {}

    public int getVoulume() {
        return voulume;
    }

    public void setVoulume(int voulume) {
        this.voulume = voulume;
    }

    public static MediaPlayer getInstance() {
        return instance;
    }

}
