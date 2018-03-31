import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());

        int min_1 = a;
        int max_1 = a + c;
        int min_2 = b;
        int max_2 = b + d;

        for (int i = min_1; i <= max_1; i++) {
            for (int j = min_2; j <= max_2; j++) {
                if ((i * i - 1) % 24 == 0 && (j * j - 1) % 24 == 0) {

                    System.out.printf("%d%d%n", i, j);
                    break;
                }
            }
        }
    }
}

