import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ask Bob a question.");
        String question = scanner.nextLine();

        boolean userContinue = true;

        do {

            if (question.endsWith("?")) {
                System.out.println("Sure.");
            } else if (question.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (question.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }

            System.out.println("Would you like to ask Bob another question? (y/n)");
            String userInput = scanner.next();
            if (!userInput.equalsIgnoreCase("y")) {
                userContinue = false;
            }

        } while (userContinue);

    }
}
