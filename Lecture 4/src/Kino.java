import java.util.Scanner;

public class Kino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double result=r*c;
        switch (type){
            case "Premiere":
                System.out.printf("%.2f leva",result*12);
                break;
            case "Normal":
                System.out.printf("%.2f leva",result*7.5);
                break;
            case "Discount":
                System.out.printf("%.2f leva",result*5);
                break;

        }
    }
}
