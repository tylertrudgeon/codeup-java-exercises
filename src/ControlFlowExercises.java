public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//
//        while(i <= 15) {
//            System.out.println("i = " + i);
//            i++;
//        }

        int i = 100;
        do {
            if (i % 5 == 0) {
                System.out.println("i = " + i);
            }
            i--;
        } while (i >= (-10));

    }
}
