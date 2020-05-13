package Movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {

        boolean running = true;

        while(running) {
            System.out.println(returnMenuDisplay());

            int response = promptUserForChoice();
            running = executeUserChoice(response);
        }
    }

    private static boolean executeUserChoice(int choice) {
        boolean continueApp = true;

        switch (choice) {
            case 0:
                continueApp = false;
                break;
            case 1:
                for(Movie movie : MoviesArray.findAll()) {
                    System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                }
                break;
            case 2:
                viewByCategory("animated");
                break;
            case 3:
                viewByCategory("drama");
                break;
            case 4:
                viewByCategory("horror");
                break;
            case 5:
                viewByCategory("scifi");
                break;
        }
        return continueApp;
    }

    private static void viewByCategory(String category) {
        for(Movie movie : MoviesArray.findAll()) {
            if(movie.getCategory().equalsIgnoreCase(category)) {
                System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
            }
        }
    }

    private static String returnMenuDisplay() {
        String choices = "What would you like to do?\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category";
        return choices;
    }

    private static int promptUserForChoice() {
        Input input = new Input();
        System.out.println("Enter your choice: ");
        int response = input.getInt(0, 5);

        return response;
    }


}
