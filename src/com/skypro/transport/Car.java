package com.skypro.transport;

import java.util.List;

public class Car extends Transport implements Competing{

    private final  Integer pitStopTime;
    private final Integer maxSpeed;
    private final Integer bestLapTime;
    private BodyType bodyType;


    public Car(String brand, String model, float engineVolume,  List<Mechanic> mechanicList, Integer pitStopTime, Integer maxSpeed, Integer bestLapTime) {
        super(brand, model, engineVolume, mechanicList);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
        this.bodyType = bodyType;

    }
    @Override
    public void nameofTheCarDriver() {
        System.out.println("Имя водителя - " + Driver.getName());
    }

    @Override
    public  void mechanicsServicingTheCar() {
        System.out.println("Имена механников, обслуживающих автомобиль " + Car.getBrand() + Car.getModel() + " : " + getMechanicList());
    }

    @Override
    void start() {
        System.out.println("Car started");
    }

    @Override
    void finish() {
        System.out.println("Car finished");
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    @Override
    public Type getType() {
        return Type.CAR;
    }
    @Override
    public void printType(){
        if (getBodyType() == null){
            System.out.println("Недостаточно данных");
        }else {
            System.out.println(getBodyType());
        }
    }

    @Override
    public boolean passDiagnostics() throws TransportTypeException {
        return this.passDiagnostics();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public void getPitStop() {
        System.out.println("Pit-stop" + pitStopTime);
    }
    @Override
    public void getBestLapTime() {
        System.out.println("Best lap time" + bestLapTime);
    }
    @Override
    public void getMaxSpeed() {
        System.out.println("Max speed" + maxSpeed);
    }
    @Override
    public String toString() {
        return   "brand: " + getBrand() +
                ", model: " + getModel() +
                ", engineVolume: " + getEngineVolume() +
                ", mechanics: " + getMechanicList() +
                ", pitStopTime: " + pitStopTime +
                ", maxSpeed: " + maxSpeed +
                ", bestLapTime: " + bestLapTime +
                ", type: " + bodyType;
    }
}
