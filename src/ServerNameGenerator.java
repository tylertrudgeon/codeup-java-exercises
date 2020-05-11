import java.util.Random;

public class ServerNameGenerator {
    public static String[] adjectives = {"short", "tall", "skinny", "thin", "fat", "funny", "mean", "happy", "angry", "sick"};
    public static String[] nouns = {"chair", "fan", "cup", "mug", "phone", "cable", "modem", "cat", "keyboard", "clippers"};

    public static void main(String[] args) {
        System.out.println(getWord(adjectives) + " " + getWord(nouns));
    }

    public static String getWord(String[] choices) {
        Random random = new Random();
        int randomNumber = random.nextInt(choices.length);
        return choices[randomNumber];
    }
}
