public class Truck extends Vehicle {
    private double capacity;
    private int numAxles;

    public Truck(String brand, int year, double capacity, int numAxles) {
        super(brand, year);
        this.capacity = capacity;
        this.numAxles = numAxles;
    }
    public void startEngine() {
        System.out.println(brand + " жүк машинасы қозғала бастады");
    }
    public void stopEngine() {
        System.out.println(brand + " жүк машинасы қозғалысын тоқтатты");
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Capacity: " + capacity + " tons, Axles: " + numAxles);
    }
}

