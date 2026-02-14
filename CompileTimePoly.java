class Calculator {

    int add(int a, int b) {
        return a + b;
    }


    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CompileTimePoly {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println("Sum of 2 numbers: " + c.add(10, 20));
        System.out.println("Sum of 3 numbers: " + c.add(10, 20, 30));
    }
}
