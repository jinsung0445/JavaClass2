package org.dimigo.interfaces;

import org.dimigo.abstractclass.BenzEngine;
import org.dimigo.abstractclass.BmwEngine;
import org.dimigo.abstractclass.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.setEngine(new BenzEngine());
        car.start();
        car.stop();
        System.out.println("=== 엔진 교체 ===");
        car.setEngine(new BmwEngine());
        car.start();
        car.stop();
    }
}
