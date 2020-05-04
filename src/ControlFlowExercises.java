public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//
//        while(i <= 15) {
//            System.out.println("i = " + i);
//            i++;
//        }

//        int i = 2;
//        do {
//            System.out.println("i = " + (i * i));
//            i++;
//        } while (i < 1000000);

        for (int i = 5; i <= 15; i++) {
            System.out.println("i = " + i);
        }

        for (int i = 2; i <= 1000000; i++) {
            i = i * i;
            System.out.println("i = " + i);
        }

    }
}
