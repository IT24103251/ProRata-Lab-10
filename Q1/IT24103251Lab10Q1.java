import java.util.Scanner;

public class IT24103251Lab10Q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the mark (0 - 100): ");
        int mark = sc.nextInt();

        //  1 - mark must be between 0 and 100 inclusive
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";

        System.out.println("Mark is Validated");

        // finding the grade
        char grade;

        if (mark >= 75) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else if (mark >= 50) {
            grade = 'C';
        } else if (mark >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // A 2 - check the grade matches the mark range
        boolean correct = false;

        if (grade == 'A' && mark >= 75) {
            correct = true;
        } else if (grade == 'B' && mark >= 60 && mark <= 74) {
            correct = true;
        } else if (grade == 'C' && mark >= 50 && mark <= 59) {
            correct = true;
        } else if (grade == 'D' && mark >= 40 && mark <= 49) {
            correct = true;
        } else if (grade == 'F' && mark < 40) {
            correct = true;
        }

        assert (correct) : "Incorrect Grade Assigned";

        System.out.println("The Grade for the Entered Mark is: " + grade);
    }
}