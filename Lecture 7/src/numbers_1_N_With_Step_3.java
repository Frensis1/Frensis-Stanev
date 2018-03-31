import java.util.Scanner;

public class numbers_1_N_With_Step_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int n =Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=n ; i+=3) {
            System.out.println(i);
        }
    }
}
