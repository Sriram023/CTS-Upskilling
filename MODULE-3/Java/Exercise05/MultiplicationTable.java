import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter a Number: ");
        int s = scanner.nextInt();      
        System.out.println("\nMultiplication Table of " + s + "\n");  
        for (int i = 1; i <= 10; i++) { 
            int result = s * i;  
            System.out.println(s + " x " + i + " = " + result);
        }
        scanner.close();
    }
}
