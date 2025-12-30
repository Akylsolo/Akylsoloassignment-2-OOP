public class Car extends Vehicle {
    private int doors;
    private String fuelType;
    public Car(String brand, int year, int doors, String fuelType) {
        super(brand, year);
        this.doors = doors;
        this.fuelType = fuelType;
    }
    public void startEngine() {
        System.out.println(brand + " машина қозғала бастады");
    }
    public void stopEngine() {
        System.out.println(brand + " машина қозғалысын тоқтатты");
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + doors + ", Fuel Type: " + fuelType);
    }
}