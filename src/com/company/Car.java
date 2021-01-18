package com.company;

public class Car {
    private final Engine engine;
    private Driver driver;

    public Car(Engine engine) {

        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void move() {
        engine.start();
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", driver=" + driver +
                '}';
    }
}

