import java.util.Scanner;

public class Verification_for_Excellent_Assessment {
    public static void main(String[] args) {
        while (true) {
             Scanner scanner = new Scanner(System.in);
              double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 5.50&& grade <6) {
                System.out.println("Exellent!");
            } else if (grade < 5.50 && grade >= 2.5) {
                System.out.println("Not exellent!");
            } else if (grade < 2.5) {
                System.out.println("poor");
            }else if (grade>6) {
                System.out.println("gosho");
            }
        }
    }
}


