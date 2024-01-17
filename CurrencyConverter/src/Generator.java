import java.util.*;

public class Generator {
    private static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "1234567890";
    private static final String SYMBOLS = "!@#$%^&*()-_=+\\/~?";
    private static final int LENGTH = 14;


    public static String generate() {
        List<String> types = new ArrayList<>(List.of(UPPERCASE_LETTERS, LOWERCASE_LETTERS, NUMBERS, SYMBOLS));
        StringBuilder password = new StringBuilder();

        boolean isCorrect = false;
        while (!isCorrect) {
            password.append(getRandomChar(types));

            if (password.length() == LENGTH) {
                isCorrect = true;
            }
        }

        return password.toString();
    }


    private static char getRandomChar(List<String> types) {
        Random rand = new Random();
        int i = rand.nextInt(types.size());
        String type = types.get(i);
        return type.charAt(rand.nextInt(type.length()));
    }


    public static void main(String[] args) {
        System.out.println(Generator.generate());
    }
}
