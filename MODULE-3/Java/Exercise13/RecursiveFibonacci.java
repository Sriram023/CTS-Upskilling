import java.util.Scanner;
public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        System.out.print("Enter n: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            System.out.println(); 
            if (n <= 0) {
                System.out.println("Invalid Input! Please enter a positive integer greater than 0.");
            } else {
                int result = fibonacci(n);
                System.out.println(n + "th Fibonacci Number = " + result);
            }
        } else {
            System.out.println("\nInvalid Input! Please enter a valid integer.");
        }
        
        scanner.close();
    }
    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
