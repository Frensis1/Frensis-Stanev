import java.util.Scanner;

public class Christmas_Tree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int n = Integer.parseInt(scanner.nextLine());


            System.out.printf("%s | %s%n",repeatString(" ",n),repeatString("",n));
        int space=n-1;
        int stars=1;
            for (int i = 0; i <n ; i++) {
            System.out.printf("%s%s | %s%s%n",
                    repeatString(" ",space),
                    repeatString("*",stars),
                    repeatString("*",stars),
                    repeatString(" ",space));

                    space--;
            stars++;
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