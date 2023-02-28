package com.skypro.transport;
import java.util.ArrayList;
import java.util.List;

public abstract class Transport {
    private static String brand;
    private static String model;
    private static float engineVolume;


    public Transport(String brand, String model, float engineVolume) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.engineVolume = validateInteger(engineVolume, 0);
    }
    List<Mechanic> mechanic = new ArrayList<>();
    String mechanic1 = String.valueOf(new Mechanic("Князев Дмитрий", "Автосервис"));
    String mechanic2 = String.valueOf(new Mechanic("Баринов Кирил", "Автосервис"));
    String mechanic3 = String.valueOf(new Mechanic("Попов Антон", "Автосервис"));
    String mechanic4 = String.valueOf(new Mechanic("Иванов Александр", "Автосервис"));

    public void nameofTheCarDriver(){
        System.out.println("Имя водителя - " + Driver.getName());
    }
    public  void mechanicsServicingTheCar(){
        System.out.println("Имена механников, обслуживающих автомобиль " + Car.getBrand() + Car.getModel() + " : " + mechanic1 + " , " + mechanic4);
    }

    public static String getBrand() {
       return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public static String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    private float validateInteger(float engineVolume, Integer value) {
        return value == null || value <= 1 ? 0 : value;
    }

    private String validateCarParameters(String value) {
        return value == null ? "не указано" : value;
    }
    void start(){
    }
    void finish(){
    }
    public abstract Type getType();

    public abstract void printType();
    public boolean checkTransportNeedService () {
        try {
            passDiagnostics();
        } catch (TransportTypeException e) {
            return false;
        }
        return true;
    }

    public abstract boolean passDiagnostics() throws TransportTypeException;

    @Override
    public String toString() {
        return  "brand: " + brand +
                ", model: " + model +
                ", engineVolume: " + engineVolume;
    }
}
