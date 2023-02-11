package com.skypro.transport;

import java.time.LocalDate;
import java.util.Objects;

public class Car extends Transport {
    private float engineVolume;
    private String transmission;
    private  final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean summerTires;
    private Key key;


    public Car(String brand,
               String model,
               float engineVolume,
               String bodyColor,
               int yearOfRelease,
               String countryOfProduction,
               String transmission,
               String bodyType,
               String registrationNumber,
               int numberOfSeats) {
      super(brand,
              model,
              yearOfRelease,
              countryOfProduction,
              bodyColor,
              Transport.maxMovementSpeed);
        this.brand = (brand == null || brand == "" ? "default": brand);
        this.model = (model == null || model == ""? "default": model);
        this.engineVolume = engineVolume <= 0 ? (float) 1.5 :engineVolume;
        this.bodyColor = (bodyColor() != null && bodyColor() != "" ? bodyColor() : "white");
        this.yearOfRelease = (yearOfRelease <= 0 ? 2000: yearOfRelease);
        this.countryOfProduction = (countryOfProduction == null || countryOfProduction == ""? "default": countryOfProduction );
        this.transmission = (transmission == null || transmission ==  "" ? "default" : transmission);
        this.bodyType = (bodyType == null || bodyType == "" ? "default" : bodyType);
        this.registrationNumber = (registrationNumber == null || registrationNumber == "" ? "default" : registrationNumber);
        this.numberOfSeats = numberOfSeats;
        this.summerTires = changeTiresForSeasonalOnes();
    }

    protected String BodyColor() {
        if (bodyColor() != null && !Objects.equals(bodyColor(), "")) {
        } return bodyColor();
    }

    @Override
    public String toString() {

        return  "brand: " + getBrand() +
                ", model: " + getModel() +
                ", engineVolume: " + engineVolume +
                ", color: " + getBodyColor() +
                ", productionYear: " + getYearOfRelease() +
                ", productionCountry: " + getCountryOfProduction() +
                ", transmission: " + transmission +
                ", bodyType: " + bodyType +
                ", registrationNumber: " + registrationNumber +
                ", numberOfSeats: " + numberOfSeats +
                ", summerTires: " + changeTiresForSeasonalOnes() +
                ", key: " + new Car.Key(true, true);
    }

    public boolean changeTiresForSeasonalOnes() {
        boolean tyresType = true;
        int month = LocalDate.now().getDayOfMonth();
        if (month >= 11 && month <= 12 || month <= 3) {
            tyresType = true;
        }
        if (month >= 4 && month <= 10){
            tyresType = false;
        }
        return tyresType;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public float getEngineVolume() {
        return engineVolume;
    }
    public String getTransmission() {
        return transmission;
    }
    public String getBodyType() {
        return bodyType;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public boolean isSummerTires() {
        return summerTires;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }
    public Key getKey() {
        return key;
    }
    public void setKey(Key key) {
        this.key = key;
    }


    public static class Key{
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key (boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
        @Override
        public String toString() {
            return  "remoteEngineStart: " + remoteEngineStart +
                    ", keylessAccess: " + keylessAccess ;
        }
    }
}
