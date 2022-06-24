package syntax;

public class Laptop {
    String make;
    String model;
    String storage;
    String memory;
    double screenSize;

    public Laptop() {
        System.out.println("Basic construction is happening...");

    }
    public Laptop(String make) {
        this.make = make;
  ;
    }
    public Laptop(String make, String model, String storage, String memory, double screenSize) {
        this.make = make;
        this.model = model;
        this.storage = storage;
        this.memory = memory;
        this.screenSize = screenSize;
    }
}
