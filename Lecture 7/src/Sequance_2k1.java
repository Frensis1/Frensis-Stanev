import java.util.Scanner;

public class Sequance_2k1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int num = 1;
        while (n >= num) {
            System.out.println(num);
            num = num * 2 + 1;
        }
    }
}