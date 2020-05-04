import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What number would you like to go up to?");
        int number = scanner.nextInt();

        System.out.println("Here is your table!");
        System.out.println();

        String topOfTable = "number  |" + "  squared  |" + "  cubed\n"
                          + "--------|" + "-----------|" + "-------";
        System.out.println(topOfTable);

        String row = "";
        int square = 0;
        int cubed = 0;

        for (int i = 1; i <= number; i++) {
            square = i * i;
            cubed = i * i * i;

            row = i + "       |" + square + "          " + "|" + cubed;

            System.out.println(row);
        }

    }
}
