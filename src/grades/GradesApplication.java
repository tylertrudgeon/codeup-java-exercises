package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    static Input input = new Input();

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();
        Student tyler = new Student("Tyler");
        Student bob = new Student("Bob");
        Student bill = new Student("Bill");
        Student steve = new Student("Steve");


        students.putIfAbsent("ttrudgeon",tyler);
        tyler.addGrade(93);
        tyler.addGrade(98);
        tyler.addGrade(98);

        students.putIfAbsent("bobgit",bob);
        bob.addGrade(89);
        bob.addGrade(85);
        bob.addGrade(92);

        students.putIfAbsent("stevegit",steve);
        steve.addGrade(76);
        steve.addGrade(82);
        steve.addGrade(89);

        students.putIfAbsent("billgit",bill);
        bill.addGrade(77);
        bill.addGrade(68);
        bill.addGrade(90);

        cli(students);
    }

    public static void cli(HashMap<String, Student> students) {
        System.out.println("Welcome!\n" +
                "\n" +
                "Here are the GitHub usernames of our students:");
        do{
            for(String key : students.keySet()) {
                System.out.print(key + "  |  ");
            }
            System.out.println();
            System.out.println("What student would you like to see more information on?");

            String userInput = input.getString();

            if (students.containsKey(userInput)) {
                System.out.printf("Name: %s - Github Username: %s\n" + "Current Average: %.1f\n",
                        students.get(userInput).getName(),
                        userInput,
                        students.get(userInput).getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + userInput + ".");
            }
        } while (input.yesNo());
        System.out.println("Goodbye, and have a wonderful day!");
    }
}
