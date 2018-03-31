import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            System.out.println(repeatString("*",i));
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