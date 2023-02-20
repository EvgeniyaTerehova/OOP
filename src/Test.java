import com.skypro.transport.*;

public class Test {
    private static Car[] cars = new Car[4];
    private static Bus[] buses = new Bus[4];
    private static Truck[] trucks = new Truck[4];

    private static DriverB[] driverBS = new DriverB[4];
    private static DriverC[] driverCS = new DriverC[4];
    private static DriverD[] driverDS = new DriverD[4];

    public static void main(String[] args) {
        cars = new Car[]{
                new Car("Audi", "A8", 3.0f, 10, 250, 60),
                new Car("BMW", "Z8", 2.4f, 12, 248, 55),
                new Car("Kia", "Sportage 4", 2.4f, 11, 245, 58),
                new Car("Hyundai", "Avent", 1.6f, 14, 240, 61),
        };
        printCars();
        System.out.println();

        buses = new Bus[]{
                new Bus("Mercedes-Benz", "Conecto G", 7.7f, 25, 205, 120),
                new Bus("Mercedes-Benz", "Intouro", 7.2f, 26, 181, 119),
                new Bus("Mercedes-Benz", "Travego", 12.8f, 24, 180, 120),
                new Bus("Mercedes-Benz", "Tourismo M2", 10.7f, 27, 185, 123)
        };
        printBuses();
        System.out.println();

        trucks = new Truck[]{
                new Truck("Foton", "Ollin BJ1069", 4.5f, 20, 195, 150),
                new Truck("Foton", "BJ 1089VDPFG-SD", 4.8f, 21, 198, 154),
                new Truck("BAW", "Tonik", 4.7f, 23, 189, 149),
                new Truck("BAW", "Fenix L", 4.3f, 25, 196, 161)

        };
        printTrucks();
        System.out.println();

        driverBS = new DriverB[]{
                new DriverB("Степанов Николай Иванович", true, 7),
                new DriverB("Киров Роман Антонович", true, 8),
                new DriverB("Строков Савва Николаевич", true, 10),
                new DriverB("Тофт Михаил Михайлович", true, 12)

        };
        printDriverBS();
        System.out.println();

        driverCS = new DriverC[]{
                new DriverC("Белякин Иван Иванович", true, 14),
                new DriverC("Федотов Иван Васильевич", true, 13),
                new DriverC("Чаварга Василий Иванович", true, 8),
                new DriverC("Михеев Василий Александрович", true, 9)

        };
        printDriverCS();
        System.out.println();

        driverDS = new DriverD[]{
                new DriverD("Фурлетов Антон Иванович", true, 9),
                new DriverD("Жданов Антон Николаевич", true, 14),
                new DriverD("Витов Арнольд Константинович", true, 13),
                new DriverD("Коншу Алексей Сергеевич", true, 14)

        };
        printDriverDS();
        System.out.println();

        printCarMessage();
        System.out.println();

        printBodyTape();
        System.out.println();
        printTypeCapacity();
        System.out.println();
        printTypeLoadCapacity();
    }

    private static void printTypeLoadCapacity() {
        for (TypeLoadCapacity typeLoadCapacity : TypeLoadCapacity.values()){
            System.out.println(TypeLoadCapacity.N1);
            System.out.println(TypeLoadCapacity.N2);
            System.out.println(TypeLoadCapacity.N3);
        }
    }

    private static void printTypeCapacity() {
        for (TypeCapacity typeCapacity : TypeCapacity.values()) {
            System.out.println(TypeCapacity.ESPECIALESMALL);
            System.out.println(TypeCapacity.SMALL);
            System.out.println(TypeCapacity.AVERAGE);
            System.out.println(TypeCapacity.BIG);
            System.out.println(TypeCapacity.ESPECIALEBIG);
        }
    }

    private static void printBodyTape() {
        for (BodyType bodyType : BodyType.values()){
            System.out.println("Тип кузова: " + bodyType.getNameBodyType());
        }
    }


    private static void printCars() {
            for (Car car : cars) {
                if (car != null) {
                    System.out.println("Car: " + car);
                }
            }
        }

       private static void printBuses() {
          for (Bus bus : buses) {
              if (bus != null) {
                System.out.println("bus: " + bus);
              }
          }
       }

        private static void printTrucks () {
            for (Truck truck : trucks) {
                if (truck != null) {
                    System.out.println("truck: " + truck);
                }
            }
        }

        private static void printDriverBS () {
            for (DriverB driverB : driverBS) {
                if (driverB != null) {
                    System.out.println("driverB: " + driverB);
                }
            }
        }

        private static void printDriverCS () {
            for (DriverC driverC : driverCS) {
                if (driverC != null) {
                    System.out.println("driverC: " + driverC);
                }
            }
        }

        private static void printDriverDS () {
            for (DriverD driverD : driverDS) {
                if (driverD != null) {
                    System.out.println("driverD: " + driverD);
                }
            }
        }
        private static void printCarMessage() {
            System.out.println("Водитель " + Driver.getName() + " управляет машиной " + Car.getBrand() + " " + Car.getModel() + " и будет учавствовать в заезде.");
        }

    }
