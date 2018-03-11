import java.util.Scanner;

public class Trade_Comissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double sale = Double.parseDouble(scanner.nextLine());
        double result = -1;
        if ((town.equalsIgnoreCase("Sofia") && (sale >= 0 && sale <= 500))) {
            result = sale * 0.05;
        } else if ((town.equalsIgnoreCase("Sofia") && (sale > 500 && sale <= 1000))) {
            result = sale * 0.07;
        } else if ((town.equalsIgnoreCase("Sofia") && (sale > 1000 && sale <= 10000))) {
            result = sale * 0.08;
        } else if ((town.equalsIgnoreCase("Sofia") && (sale > 10000))) {
            result = sale * 0.12;
        } else if ((town.equalsIgnoreCase("Plovdiv") && (sale >= 0 && sale <= 500))) {
            result = sale * 0.055;
        } else if ((town.equalsIgnoreCase("Plovdiv") && (sale > 500 && sale <= 1000))) {
            result = sale * 0.08;
        } else if ((town.equalsIgnoreCase("Plovdiv") && (sale > 1000 && sale <= 10000))) {
            result = sale * 0.12;
        } else if ((town.equalsIgnoreCase("Plovdiv") && (sale > 10000))) {
            result = sale * 0.145;
        } else if ((town.equalsIgnoreCase("Varna") && (sale >= 0 && sale <= 500))) {
            result = sale * 0.045;
        } else if ((town.equalsIgnoreCase("Varna") && (sale > 500 && sale <= 1000))) {
            result = sale * 0.75;
        } else if ((town.equalsIgnoreCase("Varna") && (sale > 1000 && sale <= 10000))) {
            result = sale * 0.10;
        } else if ((town.equalsIgnoreCase("Varna") && (sale > 10000))) {
            result = sale * 0.13;
        } else {
            System.out.println("error");
        }if (result>0)
        System.out.printf("%.2f",result);
    }
}