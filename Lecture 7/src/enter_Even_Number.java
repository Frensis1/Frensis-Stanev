import java.util.Scanner;

public class enter_Even_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                int n = Integer.parseInt(scanner.nextLine());
                if (n % 2 == 0) {
                    System.out.println("Even number entered: " + n);
                    return;
                } else {
                    System.out.println("The number is not even.");
                }

            } catch (Exception s) {
                System.out.println("Invalid number!");
            }

        }
    }
}
