import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Student Marks Calculator ===");

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter marks for Subject 1: ");
        double mark1 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 2: ");
        double mark2 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 3: ");
        double mark3 = scanner.nextDouble();

        double total = mark1 + mark2 + mark3;
        double average = total / 3.0;

        System.out.println("\n=== Result ===");
        System.out.println("Student: " + name);
        System.out.printf("Total Marks: %.2f / 300%n", total);
        System.out.printf("Average: %.2f%n", average);

        if (mark1 < 0 || mark1 > 100 ||
            mark2 < 0 || mark2 > 100 ||
            mark3 < 0 || mark3 > 100) {
            System.out.println("Error: Each mark must be between 0 and 100.");
        } else if (average >= 75) {
            System.out.println("Grade: Distinction");
        } else if (average >= 60) {
            System.out.println("Grade: First Class");
        } else if (average >= 40) {
            System.out.println("Grade: Pass");
        } else {
            System.out.println("Grade: Fail");
        }

        scanner.close();
    }
}
