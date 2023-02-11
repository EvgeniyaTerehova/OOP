package com.skypro.transport;

import static com.skypro.transport.ValidateUtils.validateString;

public class Transport {
    public String brand;
    public String model;
    public int yearOfRelease;
    public String countryOfProduction;
    public String bodyColor;
    public static int maxMovementSpeed;


    public Transport(String brand,
                     String model,
                     int yearOfRelease,
                     String countryOfProduction,
                     String bodyColor,
                     int maxMovementSpeed) {
        this.brand = brand;
        this.model = model;
        this.yearOfRelease = yearOfRelease;
        this.countryOfProduction = countryOfProduction;
        this.bodyColor = bodyColor;
        this.maxMovementSpeed = maxMovementSpeed;
    }


    public static String validateBodyColors (String value){
        return validateString(value, "default");
    }
    public static Integer validateYearOfRelease (Integer value){
        return value == null ? 1999 : value;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public  String getCountryOfProduction() {
        return countryOfProduction;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public int getMaxMovementSpeed() {
        return maxMovementSpeed;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public void setMaxMovementSpeed(int maxMovementSpeed) {
        this.maxMovementSpeed = maxMovementSpeed;
    }

    @Override
    public String toString() {
        return   "Transport- " + "brand: " + brand +
                ", model: " + model +
                ", yearOfRelease: " + yearOfRelease +
                ", countryOfProduction: " + countryOfProduction +
                ", bodyColor: " + bodyColor +
                ", maxMovementSpeed: " + maxMovementSpeed;
    }

    protected String bodyColor() {
        return bodyColor;
    }
}
