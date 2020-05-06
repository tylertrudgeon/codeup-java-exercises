import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println(add(2, 5));
//        System.out.println(subtract(10, 4));
//        System.out.println(multiply(6, 3));
//        System.out.println(divide(10, 2));
//        System.out.println(modulus(8,2));
//        getInteger(1, 10);
//        calculateFactorial(scanner);
        rollDice(scanner);

    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
//        return num1 * num2;
        int answer = 0;
        for (int x = 1; x <= num2; x++) {
            answer += num1;
        }
        return answer;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    public static void getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 10: ");
        int num = scanner.nextInt();

        if (num > 0 && num < 10 ) {
            System.out.println("That is a valid number.");
            return;
        }

        System.out.println("That is not a valid number, try again.");
        getInteger(min, max);
    }

    public static void calculateFactorial(Scanner scanner) {
        boolean userConfirmation = true;

        do {
            System.out.println("Enter a number between 1 and 10: ");
            int userInput = scanner.nextInt();

            int newInput = userInput;

            if (userInput > 0 && userInput <= 10) {
                for (long i = 1; i < newInput; i++) {
                    userInput *= i;
                }
                System.out.println(userInput);
            }

            System.out.println("Would you like to continue? (y/n)");
            String userResponse = scanner.next();

            if (!userResponse.equalsIgnoreCase("y")) {
                userConfirmation = false;
            }

        } while (userConfirmation);
    }

    public static void rollDice(Scanner scan) {
        boolean userConfirmation = true;

        do {
            System.out.println("Number of sides for the dice.");
            int numberOfSides = scan.nextInt();

            Random roll = new Random();

            int firstDice = roll.nextInt(numberOfSides) + 1;
            int secondDice = roll.nextInt(numberOfSides) + 1;

            System.out.println("Your first dice rolled: " + firstDice);
            System.out.println("Your second dice rolled: " + secondDice);

            System.out.println("Would you like to roll again? (y/n)");
            String userResponse = scan.next();
            if (!userResponse.equalsIgnoreCase("y")) {
                userConfirmation = false;
            }

        } while (userConfirmation);
    }

}
