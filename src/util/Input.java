package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    public void getString() {
        System.out.println("Text here: ");
        String text = scanner.nextLine();
        System.out.println(text);
    }

    public void yesNo(){
        System.out.println("yes or no?");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public int getInt (int min, int max){
        System.out.println("Please enter a number between " + min + " and " + max +": ");
        int num = scanner.nextInt();
        if(num < min || num > max) {
            System.out.println("Not a valid number.");
            getInt(min, max);
        } else {
            System.out.println("Good job.");
        }
        return num;
    }

    public void getInt (){
        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Here's your number: " + num);
    }

    public void getDouble (double minD, double maxD){
        System.out.println("Please enter a number between " + minD + " and " + maxD +": ");
        double num = scanner.nextDouble();
        if(num < minD || num > maxD) {
            System.out.println("Not a valid number.");
            getDouble(minD, maxD);
        } else {
            System.out.println("Good job.");
        }
    }

    public void getDouble (){
        System.out.println("Please enter a decimal: ");
        double num = scanner.nextDouble();
        System.out.println("Here's your decimal: " + num);
    }


}
