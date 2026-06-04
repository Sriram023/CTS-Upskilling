import java.util.Scanner;

public class EvenOddChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int a = sc.nextInt();

        if ( a % 2 == 0) {
            System.out.println(a + " is an Even Number.");
        } else {
            System.out.println(a + " is an Odd Number.");
        }

        sc.close();
    }
}
