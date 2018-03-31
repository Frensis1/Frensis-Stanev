import java.util.Scanner;

public class check_Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        if (n<2){
            System.out.println("Not prime");
            return;
        }
        boolean isPrime=true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("Not Prime");
                isPrime=false;
                break;
            }
        }
        if (isPrime){
            System.out.println("Prime");
        }
    }
}
