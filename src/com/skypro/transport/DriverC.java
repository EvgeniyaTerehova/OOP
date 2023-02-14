package com.skypro.transport;

public class DriverC <T extends Truck> extends Driver {
    public DriverC(String name, Boolean license, Integer experience) {
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

    public String getTruckMessage (T Truck) {
        return "Driver " + getName() + "is driving car " + Truck.getBrand() + " " + Truck.getModel() + "will participate in race";
    }
}
