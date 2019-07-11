package org.dimigo.interfaces;

public class Car {
    private IEngine IEngine;

    public void setIEngine(IEngine IEngine) {
        this.IEngine = IEngine;
    }

    public void start() {
        IEngine.startEngine();
    }

    public void stop(){ IEngine.stopEngine();
    }
}
