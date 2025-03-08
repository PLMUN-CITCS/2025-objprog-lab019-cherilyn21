import java.util.Scanner;

public class FactorialCalculator {
    
    public static void main(String[] args) {
        int number = getNonNegativeInteger();
        long factorial = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
    
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int number = -1;
        
        while (number < 0) {
            System.out.print("Enter a non-negative integer: ");
            
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                
                if (number < 0) {
                    System.out.println("Error: Please enter a non-negative integer.");
                }
            } else {
                System.out.println("Error: Please enter a valid integer.");
                scanner.next(); 
            }
        }
        scanner.close();
        return number;
    }
    
    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        
        return result;
    }
}