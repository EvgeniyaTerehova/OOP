public class Test {
    private static Car[] cars = new Car[5];

    public static void main(String[] args) {
        cars = new Car[]{
                new Car("Lada", "Granta", 1.7f, "yellow", 2015, "Russia"),
                new Car("Audi", "A8", 3.0f, "black", 2020, "Germany"),
                new Car("BMW", "Z8", 2.4f, "black", 2021, "Germany"),
                new Car("Kia", "Sportage 4", 2.4f, "red", 2018, "South Korea"),
                new Car("Hyundai", "Avtyn", 1.6f, "orange", 2016, "South Korea"),
                new Car(null, null, 0, null, 0, null)
        }; printCars();

    }
    public static void printCars(){
        for (Car car : cars) {
            if (car != null) {
                System.out.println("Car: " + car);
            }
        }
    }
}