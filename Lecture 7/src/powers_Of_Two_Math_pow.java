import java.util.Scanner;

public class powers_Of_Two_Math_pow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <=n; i++) {
            System.out.println((int)Math.pow(2,i));

        }
    }
}
