import java.util.Scanner;

public class Hause {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());


            if (n % 2 == 0) {
                int stars = 2;
                int dash = (n - 2) / 2;
                for (int i = 0; i < (n + 1) / 2; i++) {
                    System.out.printf("%s%s%s%n"
                            , repeatString("-", dash)
                            , repeatString("*", stars)
                            , repeatString("-", dash));
                    stars += 2;
                    dash--;
                }
            }
        else if (n % 2 != 0) {
            int stars = 1;
            int dash = (n - 1) / 2;
            for (int i = 0; i < (n + 1) / 2; i++) {
                System.out.printf("%s%s%s%n"
                        , repeatString("-", dash)
                        , repeatString("*", stars)
                        , repeatString("-", dash));
                stars+=2;
                dash--;
            }
        }
        for (int i = 0; i < n/2; i++) {
            System.out.printf("|%s|%n",repeatString("*",n-2));
        }
    }

    public static String repeatString(String str, int count) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }
}