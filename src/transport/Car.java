package transport;

import java.time.LocalDate;
import java.util.Objects;
public class Car {
    private final String brand;
    private final String model;
    private float engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;

    private String transmission;
    private  final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean summerTires;
    private Key key;


    public Car(String brand, String model, float engineVolume, String color, int productionYear, String productionCountry, String transmission, String bodyType, String registrationNumber, int numberOfSeats) {
        this.brand = (brand == null || brand == "" ? "default": brand);
        this.model = (model == null || model == ""? "default": model);
        this.engineVolume = engineVolume <= 0 ? (float) 1.5 :engineVolume;
        this.color = (color == null || color == ""? "white" : color);
        this.productionYear = (productionYear <= 0 ? 2000: productionYear);
        this.productionCountry = (productionCountry == null || productionCountry == ""? "default": productionCountry );
        this.transmission = (transmission == null || transmission ==  "" ? "default" : transmission);
        this.bodyType = (bodyType == null || bodyType == "" ? "default" : bodyType);
        this.registrationNumber = (registrationNumber == null || registrationNumber == "" ? "default" : registrationNumber);
        this.numberOfSeats = (numberOfSeats <= 0 && numberOfSeats >= 10 ? 0: numberOfSeats);
        this.summerTires = changeTiresForSeasonalOnes();
    }

    @Override
    public String toString() {

        return  "brand: " + brand +
                ", model: " + model +
                ", engineVolume: " + engineVolume +
                ", color: " + color +
                ", productionYear: " + productionYear +
                ", productionCountry: " + productionCountry +
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
    public String getColor() {
        return color;
    }
    public int getProductionYear() {
        return productionYear;
    }
    public String getProductionCountry() {
        return productionCountry;
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
    public void setColor(String color) {
        this.color = color;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Float.compare(car.engineVolume, engineVolume) == 0 && productionYear == car.productionYear && numberOfSeats == car.numberOfSeats && summerTires == car.summerTires && brand.equals(car.brand) && model.equals(car.model) && color.equals(car.color) && productionCountry.equals(car.productionCountry) && transmission.equals(car.transmission) && bodyType.equals(car.bodyType) && registrationNumber.equals(car.registrationNumber);
    }
    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, productionYear, productionCountry, transmission, bodyType, registrationNumber, numberOfSeats, summerTires);
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
