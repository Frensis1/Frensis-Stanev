import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
//       TOP
        if (n == 1) {
            System.out.println("*");
        } else if (n == 2) {
            System.out.println("**");
        } else if (n % 2 == 0) {
            System.out.printf("%s%s%s%n",
                    repeatString("-", (n - 1) / 2),
                    repeatString("*", 2),
                    repeatString("-", (n - 1) / 2));
        } else if (n % 2 != 0) {
            System.out.printf("%s%s%s%n", repeatString("-", (n - 1) / 2),
                    repeatString("*", 1),
                    repeatString("-", (n - 1) / 2));
        }

// MID
        if (n < 5) {
            for (int i = 1; i <= n / 3; i++) {
                System.out.printf("%s%s%s%n", repeatString("*", 1),
                        repeatString("-", n - 2), repeatString("*", 1));

            }
////        } else if (n > 5 && n % 2 == 0) {
//            for (int i = 0; i < n - 3; i++) {
//                System.out.printf("%s%s%s%s%s%n",
//                        repeatString("-",n-4/2,
//                        repeatString("*", 1,
//                                repeatString("-",2,
//                                        repeatString("*", 1,
//                                                repeatString("-",n-2);
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