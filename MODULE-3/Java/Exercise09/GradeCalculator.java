import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {   
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        if (scanner.hasNextInt()) {
            int marks = scanner.nextInt();
            System.out.println();
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid Marks! Marks must be between 0 and 100.");
            } else {
                char grade;
                if (marks >= 90) {
                    grade = 'A';
                } else if (marks >= 80) {
                    grade = 'B';
                } else if (marks >= 70) {
                    grade = 'C';
                } else if (marks >= 60) {
                    grade = 'D';
                } else {
                    grade = 'F';
                }
                System.out.println("Student Result");
                System.out.println("Marks : " + marks);
                System.out.println("Grade : " + grade);
            }
        } else {
            System.out.println("\nInvalid Input! Please enter a valid integer.");
        }
        scanner.close();
    }
}
