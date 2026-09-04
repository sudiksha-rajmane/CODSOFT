package CODSOFT;
import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("       STUDENT GRADE CALCULATOR");
        System.out.println("======================================");

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= subjects; i++) {

            System.out.print("Enter marks for Subject " + i + " (out of 100): ");
            int marks = sc.nextInt();

            while (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Enter marks between 0 and 100.");
                System.out.print("Enter marks again: ");
                marks = sc.nextInt();
            }

            totalMarks += marks;
        }

        double percentage = (double) totalMarks / subjects;

        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("\n======================================");
        System.out.println("              RESULT");
        System.out.println("======================================");
        System.out.println("Total Marks      : " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", percentage);
        System.out.println("Grade            : " + grade);
        System.out.println("======================================");

        sc.close();
    }
}

