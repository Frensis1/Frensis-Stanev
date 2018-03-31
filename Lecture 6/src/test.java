import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
// Top

        System.out.printf("%s%s%s%n", repeatString("+", 1),
                repeatString("-", n - 2),
                repeatString("+", 1));

// Mid
        for (int i = 0; i < n-2; i++) {
            System.out.printf("%s%s%s%n", repeatString("|", 1),
                    repeatString("-", n - 2),
                    repeatString("|", 1));}

// Bot
            System.out.printf("%s%s%s%n", repeatString("+", 1),
                    repeatString("-", n - 2),
                    repeatString("+", 1));
        }




    public static String repeatString(String str, int count) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }
}



