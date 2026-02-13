import java.util.Scanner;
class Calculator {
    int a, b;
    Calculator(int x, int y) {
        a = x;
        b = y;
    }
    void sum() {
        int result = a + b;
        System.out.println("Sum: " + result);
    }
    void multiply() {
        int result = a * b;
        System.out.println("Multiplication: " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        
        Calculator sumCalculator = new Calculator(num1, num2);
        Calculator multiplyCalculator = new Calculator(num1, num2);

        
        sumCalculator.sum();
        multiplyCalculator.multiply();

        scanner.close();
    }
}