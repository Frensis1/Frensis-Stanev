import java.util.Scanner;

public class Sunglases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =Integer.parseInt(scanner.nextLine());

//        top
        System.out.printf("%s%s%s%n",repeatString("*",2*n)
                ,repeatString(" ",n)
                ,repeatString("*",2*n));

        for (int i = 0; i <n-2 ; i++) {
            if (i == ((n - 1) / 2) - 1) {
                System.out.printf("*%s*%s*%s*%n",
                        repeatString("/", 2 * n - 2),
                        repeatString("|", n),
                        repeatString("/", 2 * n - 2));

            } else {
                System.out.printf("*%s*%s*%s*%n",
                        repeatString("/", 2 * n - 2),
                        repeatString(" ", n),
                        repeatString("/", 2 * n - 2));
            }
        }
//        bot
        System.out.printf("%s%s%s",repeatString("*",2*n)
                ,repeatString(" ",n)
                ,repeatString("*",2*n));
    }

    public static String repeatString(String str, int count) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }
}