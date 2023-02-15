package com.skypro.transport;

public abstract class Transport {
    private static String brand;
    private static String model;
    private static float engineVolume;

    public Transport(String brand, String model, float engineVolume) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.engineVolume = validateInteger(engineVolume, 0);
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

    @Override
    public String toString() {
        return  "brand: " + brand +
                ", model: " + model +
                ", engineVolume: " + engineVolume;
    }
}
