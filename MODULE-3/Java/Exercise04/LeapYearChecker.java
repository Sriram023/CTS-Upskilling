import java.util.Scanner;

public class LeapYearChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Year: ");
        int year_custom = sc.nextInt();

        if ((year_custom % 4 == 0 && year_custom % 100 != 0) || (year_custom % 400 == 0)) {
            System.out.println(year_custom + " is a Leap Year.");
        } else {
            System.out.println(year_custom + " is Not a Leap Year.");
        }

        sc.close();
    }
}
