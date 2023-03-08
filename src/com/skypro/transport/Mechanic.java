package com.skypro.transport;
public class Mechanic {
    private String name;
    private String company;

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public void performMaintenance(Car kia) {
        System.out.println("Механник " + name + " провёл техобслуживание " + Car.getBrand() + " " + Car.getModel());
    }
    public void fixTheCar(Bus intouro) {
        System.out.println("Механник " + name + " починил " + Bus.getBrand() + " " + Bus.getModel());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Mechanic: " +
                "name: " + name +
                ", company: " + company;
    }


}
