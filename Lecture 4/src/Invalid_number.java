import java.util.Scanner;

public class Invalid_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number =Double.parseDouble(scanner.nextLine());
        if (number==0||(number>=100&&number<=200)){
            System.out.println();
        }else {
            System.out.println("invalid");
        }
    }
}
