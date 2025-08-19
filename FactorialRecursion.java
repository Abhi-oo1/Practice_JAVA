import java.util.Scanner;

public class FactorialRecursion {
    // Method to calculate factorial using recursion
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter a non-negative number: ");
            int num = scanner.nextInt();
            
            if (num < 0) {
                System.out.println("Error: Factorial is not defined for negative numbers.");
            } else {
                System.out.println("Factorial of " + num + " is: " + factorial(num));
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
        } finally {
            scanner.close();
        }
    }
}