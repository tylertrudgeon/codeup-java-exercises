package util;

public class InputTest {

    public static void main(String[] args) {
        Input newInput = new Input();
        newInput.getString();
        newInput.yesNo();
        newInput.getInt(4, 25);
        newInput.getInt();
        newInput.getDouble(22.34, 27.88);
        newInput.getDouble();
    }
}