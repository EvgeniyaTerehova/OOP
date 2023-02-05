import java.util.Objects;
public class Car {
    private String brand;
    private String model;
    private float engineVolume;
    private String color;
    private int productionYear;
    private  String productionCountry;

    public Car(String brand, String model, float engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = (brand == null || brand == ""? "default": brand);
        this.model = (model == null || model == ""? "default": model);
        this.engineVolume = engineVolume <= 0 ? (float) 1.5 :engineVolume;
        this.color = (color == null || color == ""? "white" : color);
        this.productionYear = (productionYear <= 0 ? 2000: productionYear);
        this.productionCountry = (productionCountry == null || productionCountry == ""? "default": productionCountry );
    }

    @Override
    public String toString() {
        return  " brand: " + brand +
                ", model: " + model +
                ", engineVolume: " + engineVolume +
                ", color: " + color +
                ", productionYear: " + productionYear +
                ", productionCountry: " + productionCountry +
                ';';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Float.compare(car.engineVolume, engineVolume) == 0 && productionYear == car.productionYear && brand.equals(car.brand) && model.equals(car.model) && color.equals(car.color) && productionCountry.equals(car.productionCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, productionYear, productionCountry);
    }
}
