import java.util.Scanner;

public class FromInchToSm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inches:");
        Scanner console =new Scanner(System.in);
        double inches = Double.parseDouble(console.nextLine());
        double Sm = inches*2.54;
        System.out.println("Sm ="+ Sm);
    }
}
