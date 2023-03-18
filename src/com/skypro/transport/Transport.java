package com.skypro.transport;

import java.util.List;
import java.util.Objects;
import java.util.Queue;

public abstract class Transport {
    private static String brand;
    private static String model;
    private static float engineVolume;
    private static Queue<Object> carToTheQueue;
    private  List<Mechanic> mechanicList;
    private Type type;


    public Transport(String brand, String model, float engineVolume, List<Mechanic> mechanicList) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.engineVolume = validateInteger(engineVolume, 0);
        this.mechanicList = mechanicList;
    }

    public static Queue<Object> getCarToTheQueue() {
        return carToTheQueue;
    }

    public void setMechanicList(List<Mechanic> mechanicList) {
        this.mechanicList = mechanicList;
    }

    public List<Mechanic> getMechanicList() {
        return mechanicList;
    }
    public static void addACarToTheQueue(Transport transport) throws TransportTypeException {
        transport.passDiagnostics();
        carToTheQueue.offer(transport);
    }

    public static void carOutATechnicalInspectionOfTheCar() {
        Transport transport = (Transport) carToTheQueue.poll();
        if (transport != null) {
            List<Mechanic> carMechanics = transport.getMechanicList();
            Mechanic carMechanic = carMechanics.get(0);
            carMechanic.performMaintenance((Car) transport);
        } else {
            System.out.println("Очередь пуста");
        }
    }
    public void carDriver (){
        System.out.println("Водитель " + DriverD.getName() + " управляет " + Truck.getBrand() + " " + Truck.getModel());
    }

    public void nameofTheCarDriver(){
        System.out.println("Имя водителя - " + Driver.getName());
    }
    public  void mechanicsServicingTheCar(){
        System.out.println("Имена механников, обслуживающих автомобиль " + Car.getBrand() + Car.getModel() + " : " + getMechanicList() );
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return mechanicList.equals(transport.mechanicList) && type == transport.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mechanicList, type);
    }

    @Override
    public String toString() {
        return  "brand: " + brand +
                ", model: " + model +
                ", engineVolume: " + engineVolume +
                ", mechanics: " + mechanicList;
    }
}
