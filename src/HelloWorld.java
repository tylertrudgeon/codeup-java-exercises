public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello, ");
        System.out.print("World!" + "\n");

        int myFavoriteNumber = 23;
        System.out.println(myFavoriteNumber);

        String myString = "Tyler";
        System.out.println(myString);

        float myNumber = 3.14f;
        System.out.println(myNumber);

        //this one increments before the line is printed where x++ increments after
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) "three";

//        int x = 4;
//        x += 5;
//
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//
//        int newInt = y * x;
//
//        System.out.println(newInt);

        int x = 10;
        int y = 2;
//        x = x / y;
//        y = y - x;

        int newInt = x / y;

        int nextInt = y - x;

        System.out.println(newInt);
        System.out.println(nextInt);



    }
}
