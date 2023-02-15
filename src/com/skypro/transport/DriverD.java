package com.skypro.transport;

public class DriverD <T extends Bus> extends Driver {
    public DriverD(String name, Boolean license, Integer experience) {
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

    public String getBusMessage (T Bus) {
        return "Driver " + getName() + "is driving car " + Bus.getBrand() + " " + Bus.getModel() + "will participate in race";
    }
}
