import java.util.List;

public class strapi {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 60, 7, 8, 9, 10);
        //find the sum of three largest number in the list
        int sumOfThreeLargest = list.stream()
                .sorted((a, b) -> Integer.compare(b, a)) // Sort in descending order
                .limit(3) // Take the top 3 elements
                .mapToInt(Integer::intValue) // Convert to int stream
                .sum(); // Sum the elements
        System.out.println("Sum of three largest numbers: " + sumOfThreeLargest);

        //find the secound smallest number in the list
        int secondSmallest = list.stream()  
                .sorted() // Sort in ascending order
                .skip(1) // Skip the smallest element
                .findFirst().get();// Get the next element, which is the second smallest
                //.orElse(-1); // Return -1 if the list is empty
        System.out.println("Second smallest number: " + secondSmallest);







        //sum of square of even number grater than 10
        int sumOfSquares = list.stream()
                .filter(n -> n > 10 && n % 2 == 0) // Filter even numbers greater than 10
                .mapToInt(n -> n * n) // Square the numbers
                .sum(); // Sum the squares
        System.out.println("Sum of squares of even numbers greater than 10: " + sumOfSquares);
        
    }
    
}
