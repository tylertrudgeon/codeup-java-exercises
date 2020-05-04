import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a numerical grade from 0-100");
        int grade = scanner.nextInt();

        System.out.println("Do you want to continue? y/n");
        String userInput = scanner.next();
        boolean confirmation = userInput.equals("y");

        if (confirmation == true) {

            if (grade >= 88) {
                System.out.println("Your grade is: A");
            } else if (grade >= 80 && grade <= 87) {
                System.out.println("Your grade is: B");
            } else if (grade >= 67 && grade <= 79) {
                System.out.println("Your grade is: C");
            } else if (grade >= 60 && grade <= 66) {
                System.out.println("Your grade is: D");
            } else {
                System.out.println("Your grade is: F");
            }
        } else {
            System.out.println("nevermind then.");
        }



//        System.out.println("What number would you like to go up to?");
//        int number = scanner.nextInt();
//
//        System.out.println("Here is your table!");
//        System.out.println();
//
//        String topOfTable = "number  |" + "  squared  |" + "  cubed\n"
//                          + "--------|" + "-----------|" + "-------";
//        System.out.println(topOfTable);
//
//        String row = "";
//        int square = 0;
//        int cubed = 0;
//
//        for (int i = 1; i <= number; i++) {
//            square = i * i;
//            cubed = i * i * i;
//
//            row = i + "       |" + square + "          " + "|" + cubed;
//
//            System.out.println(row);
//        }

    }
}
