import com.skypro.transport.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

        printPassDiagnostics();
        try {
            checkTransport (buses);
        }catch (TransportTypeException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        Mechanic kniazev = new Mechanic("Князев Дмитрий", "Автосервис");
        Mechanic barinov = new Mechanic("Баринов Кирил", "Автосервис");
        Mechanic popov = new Mechanic("Попов Антон", "Автосервис");
        Mechanic ivanov = new Mechanic("Иванов Александр", "Автосервис");

        List<Mechanic> mechanicList = new ArrayList<>();
        Mechanic mechanic1 = new Mechanic("Князев Дмитрий", "Автосервис");
        Mechanic mechanic2 = new Mechanic("Баринов Кирил", "Автосервис");
        Mechanic mechanic3 = new Mechanic("Попов Антон", "Автосервис");
        Mechanic mechanic4 = new Mechanic("Иванов Александр", "Автосервис");

        mechanicList.add(mechanic1);
        mechanicList.add(mechanic2);
        mechanicList.add(mechanic3);
        mechanicList.add(mechanic4);

        System.out.println(mechanic1);
        System.out.println(mechanic2);
        System.out.println(mechanic3);
        System.out.println(mechanic4);
        System.out.println();
        mechanic1.fixTheCar(new Bus("Mercedes-Benz", "Intouro", 7.2f, 26, 181, 119));
        mechanic1.performMaintenance(new Car("Kia", "Sportage 4", 2.4f, 11, 245, 58));
        System.out.println();
        mechanicsServicingTheCar();
        System.out.println();
        printCarDriver();
        System.out.println();

        Queue<Transport> queueToService = new LinkedList<>();
        queueToService.add(new Car("Audi", "A8", 3.0f, 10, 250, 60));
        queueToService.add(new Car("BMW", "Z8", 2.4f, 12, 248, 55));
        queueToService.add(new Car("Kia", "Sportage 4", 2.4f, 11, 245, 58));
        queueToService.add(new Car("Hyundai", "Avent", 1.6f, 14, 240, 61));
        queueToService.add(new Bus("Mercedes-Benz", "Conecto G", 7.7f, 25, 205, 120));
        queueToService.add(new Bus("Mercedes-Benz", "Intouro", 7.2f, 26, 181, 119));
        queueToService.add(new Bus("Mercedes-Benz", "Travego", 12.8f, 24, 180, 120));
        queueToService.add(new Bus("Mercedes-Benz", "Tourismo M2", 10.7f, 27, 185, 123));
        queueToService.add(new Truck("Foton", "Ollin BJ1069", 4.5f, 20, 195, 150));
        queueToService.add(new Truck("Foton", "BJ 1089VDPFG-SD", 4.8f, 21, 198, 154));
        queueToService.add(new Truck("BAW", "Tonik", 4.7f, 23, 189, 149));
        queueToService.add(new Truck("BAW", "Fenix L", 4.3f, 25, 196, 161));
        System.out.println(queueToService.peek());
        printCarryOutATechnicalInspectionOfTheCar();
    }

    public void addACarToTheQueue(){
        System.out.println("Добавить авто в очередь" );
    }

    private static void printCarryOutATechnicalInspectionOfTheCar() {
        System.out.println("Техосмотр прошли: " + ServiceStation.getAiiTransport());
    }

    private static void printCarDriver() {
        System.out.println("Водитель " + DriverD.getName() + " управляет " + Truck.getBrand() + " " + Truck.getModel());
    }

    private static void mechanicsServicingTheCar() {
        System.out.println("Механники, обслуживающие автомобиль " + Car.getBrand() +" " + Car.getModel() + " : " + new Mechanic("Баринов Кирил", "Автосервис") + " , " + new Mechanic ("Иванов Александр", "Автосервис"));
    }

    public static void mechanicsServicingTheCar(String mechanic1, String mechanic4){
       
    }
    public static void nameofTheCarDriver(){
        System.out.println("Имя водителя - " + DriverD.getName());
    }
    private static void printPassDiagnostics() {
        System.out.println("Автобусы диагностику проходить не должны");
    }
    public static void checkTransport(Transport... transports) throws TransportTypeException {
        int count = 0;
        for (Transport transport : transports){
            if(transport.passDiagnostics()){
                count++;
            }
        }
        System.out.println("Диагностику прошли " + count + " из " + transports.length + "автомобилей");
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
