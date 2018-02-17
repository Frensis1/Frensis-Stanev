import java.util.Scanner;

public class Sqere {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);

        double a = Double.parseDouble(console.nextLine());
        double b = Double.parseDouble(console.nextLine());
        double h = Double.parseDouble(console.nextLine());
        System.out.println(((a+b)*h)/2);
    }
}

