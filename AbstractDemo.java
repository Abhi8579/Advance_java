abstract class Vehicle {
    abstract void start();   // abstract method

    void fuel() {            // normal method
        System.out.println("Vehicle uses fuel");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        v.fuel();
    }
}
