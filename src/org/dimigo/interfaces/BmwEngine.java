package org.dimigo.interfaces;

public class BmwEngine implements IEngine {
    @Override
    public void startEngine() {
        System.out.println("Bmw 엔진 가동");
    }

    @Override
    public void stopEngine() {
        System.out.println("Bmw 엔진 멈춤");

    }
}


