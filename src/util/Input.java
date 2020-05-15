package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    public String getString(){
        System.out.println("Type something: ");
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Continue? y/n");
        String answer = scanner.nextLine();
        return answer.equals("y") ? true : false;
    }

    public int getInt (int min, int max){
        System.out.println("Please enter a number between " + min + " and " + max +": ");
        int numB;
        try {
            numB = Integer.valueOf(getString());
        } catch (Exception e) {
            return getInt(min, max);
        }
        if(numB < min || numB > max) {
            System.out.println("Not a valid number.");
            getInt(min, max);
        }
        return numB;
    }

    public int getInt (){
        System.out.println("Please enter a number: ");
        try {
            return Integer.valueOf(getString());
        } catch (Exception e) {
            return getInt();
        }
    }

    public double getDouble (double minD, double maxD){
        System.out.println("Please enter a number between " + minD + " and " + maxD +": ");
        double aDecimal;
        try {
            aDecimal = Double.valueOf(getString());
        } catch (Exception e) {
            return getDouble(minD, maxD);
        }
        if(aDecimal < minD || aDecimal > maxD) {
            System.out.println("Not a valid number.");
            return getDouble(minD, maxD);
        }
        return aDecimal;
    }

    public double getDouble (){
        System.out.println("Please enter a decimal: ");
        try {
            return Double.valueOf(getString());
        } catch (Exception e) {
            return getDouble();
        }
    }


}
