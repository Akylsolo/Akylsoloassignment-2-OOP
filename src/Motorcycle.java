public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }
    public void startEngine() {
        System.out.println(brand + " мотоцикл қозғала бастады");
    }
    public void stopEngine() {
        System.out.println(brand + " мотоцикл қозғалысын тоқтатты");
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + hasSidecar);
    }
}