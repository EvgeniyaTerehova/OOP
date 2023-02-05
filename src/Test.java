import transport.Car;

public class Test {
    private static Car[] cars = new Car[5];

    public static void main(String[] args) {
        cars = new Car[]{
                new Car("Lada", "Granta", 1.7f, "yellow", 2015, "Russia", "manual",  "hatchback ", "P 000 CT", 5),
                new Car("Audi", "A8", 3.0f, "black", 2020, "Germany", "automatic ", "sedan", " C 000 PE ", 5),
                new Car("BMW", "Z8", 2.4f, "black", 2021, "Germany", "automatic ", "roadster", "T 000 EM", 2),
                new Car("Kia", "Sportage 4", 2.4f, "red", 2018, "South Korea", "automatic ", "four-wheel drive", "P 000 HP", 5),
                new Car("Hyundai", "Avent", 1.6f, "orange", 2016, "South Korea", "manual ", "sedan", "T 000 CA", 5),
                new Car(null, null, 0, null, 0, null, null, null, null, 0)
        }; printCars();
        Car.Key key = new Car.Key(true, true);
    }

    public static void printCars(){
        for (Car car : cars) {
            if (car != null) {
                System.out.println("Car: " + car);
            }
        }
    }
}