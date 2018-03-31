import java.util.Scanner;

public class greatest_Common_Divisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= Integer.parseInt(scanner.nextLine());
        int b= Integer.parseInt(scanner.nextLine());

        while (b!=0){
            int OldB=b;
            b=a%b;
            a=OldB;
        }
        System.out.println(a);
    }
}
