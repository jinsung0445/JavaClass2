package org.dimigo.interfaces;

public interface IAnimal {
    //상수
    public static final String FARM_NAME = "디미동물농장";

    //추상 메소드
    public  abstract void eat();
    abstract void sleep();
    void bark();

}
