import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.\n", pi);

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.print("Please type a sentence: ");
        String userSentence = scanner.nextLine();
        System.out.println(userSentence);

        System.out.println("Please enter a number.");
        int userInput = scanner.nextInt();
        System.out.printf("The number you chose was: %d\n", userInput);

        System.out.println("Please enter three words.");
        String firstWord = scanner.next();
        System.out.println(firstWord);
        String secondWord = scanner.next();
        System.out.println(secondWord);
        String thirdWord = scanner.next();
        System.out.println(thirdWord);

        System.out.println("Please enter the length of the classroom.");
        float length = scanner.nextFloat();
        System.out.println("Please enter the width of the classroom.");
        float width = scanner.nextFloat();
        System.out.println("Please enter the height of the classroom");
        float height = scanner.nextFloat();

        System.out.printf("The area of the classroom is %.2f \n", length*width);
        System.out.printf("The perimeter of the classroom is %.2f \n", (length * length) + (width * width));
        System.out.printf("The volume of the classroom is %.2f \n", length * width * height);

    }
}
