public class MethodsExercises {
    public static void main(String[] args) {

        System.out.println(add(2, 5));
        System.out.println(subtract(10, 4));
        System.out.println(multiply(6, 5));
        System.out.println(divide(10, 2));
        System.out.println(modulus(8,2));

    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
//        return num1 * num2;
        int answer = 0;
        for (int x = 1; x <= num2; x++) {
            answer += num1;
        }
        return answer;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }
}
