class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class RunTimePoly {
    public static void main(String[] args) {
        Animal a = new Dog();  // Upcasting
        a.sound();             // Method call
    }
}
