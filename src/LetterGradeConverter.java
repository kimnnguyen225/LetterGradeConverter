import java.util.Scanner;

public class LetterGradeConverter {

    public static void main(String[] args) {

        // Create an application that converts number grades to letter grades
        // Assume that the user will enter valid integers between 1 and 100 for the grades
        // The application should continue only if the user enters y or Y to continue
        // A - 88-100
        // B - 80-87
        // C - 67-79
        // D - 60-66
        // F - <60

        // welcome message
        System.out.println("Welcome to the Letter Grade Converter");
        System.out.println();

        //create Scanner
        Scanner sc = new Scanner(System.in);

        // perform conversion until choice isn't equal to y or Y
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get numerical grade from user
            System.out.println("Enter numerical grade: ");
            int numericalGrade = sc.nextInt();

            // convert numerical grade to letter grade
            String letterGrade = "";

            if (numericalGrade >= 88 && numericalGrade <= 100) {
                letterGrade = "A";
            } else if (numericalGrade >= 80 && numericalGrade <= 87) {
                letterGrade = "B";
            } else if (numericalGrade >= 67 && numericalGrade <= 79) {
                letterGrade = "C";
            } else if (numericalGrade >= 60 && numericalGrade <= 66) {
                letterGrade = "D";
            } else if (numericalGrade < 60 && numericalGrade >= 0) {
                letterGrade = "F";
            } else {
                System.out.println("Please enter whole integer between 0-100 without decimal");
                letterGrade = null;
            }

            // display result of the conversion
            System.out.println("Letter grade: " + letterGrade + "\n");

            //see if user wants to continue
            System.out.println("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        sc.close();

    }
}
