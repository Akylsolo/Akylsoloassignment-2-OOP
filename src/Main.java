public class Main {
    public static void main(String[] args) {

        Driver aibek = new Driver("Айбек", "KZ12345");
        Driver daniyar = new Driver("Данияр", "KZ54321");

        Car car1 = new Car("Toyota", 2020, 4, "Petrol");
        Motorcycle moto1 = new Motorcycle("Harley", 2018, true);
        Truck truck1 = new Truck("Kamaz", 2015, 10.5, 3);
        car1.setDriver(aibek);
        moto1.setDriver(daniyar);
        truck1.setDriver(aibek);
        Vehicle[] vehicles = {car1, moto1, truck1};
        for (Vehicle v : vehicles) {
            v.startEngine();
            v.displayInfo();
            v.stopEngine();
            if (v.getDriver() != null) {
                v.getDriver().displayDriverInfo();
            }
            System.out.println("----------");
        }
    }
}
