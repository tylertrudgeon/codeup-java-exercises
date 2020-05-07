package util;

public class InputTest {

    public static void main(String[] args) {
        Input getString = new Input();
        getString.getString();

        Input yesNo = new Input();
        yesNo.yesNo();

        Input rangeOfInt = new Input();
        rangeOfInt.getInt(4, 25);

        Input getInt = new Input();
        getInt.getInt();

        Input rangeOfDouble = new Input();
        rangeOfDouble.getDouble(22.34, 27.88);

        Input getDouble = new Input();
        getDouble.getDouble();
    }
}