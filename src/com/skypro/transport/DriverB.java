package com.skypro.transport;

public class DriverB <T extends Car> extends Driver {
    public DriverB(String name, Boolean license, Integer experience) {
        super(name, license, experience);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String getCarMessage (T Car) {
        return "Driver " + getName() + "is driving car " + Car.getBrand() + " " + Car.getModel() + "will participate in race";
    }
}
