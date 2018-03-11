import java.util.Scanner;

public class Town_shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double result = -1;
        double quantity = Double.parseDouble(scanner.nextLine());
        if (town.equalsIgnoreCase("Sofia")) {
            if (product.equalsIgnoreCase("coffee")) {
                result = quantity * 0.5;
            } else if (product.equalsIgnoreCase("water")) {
                result = quantity * 0.8;
            } else if (product.equalsIgnoreCase("beer")) {
                result = quantity * 1.2;
            } else if (product.equalsIgnoreCase("sweets")) {
                result = quantity * 1.45;
            } else if (product.equalsIgnoreCase("peanuts")) {
                result = quantity * 1.60;
            }
        } else if (town.equalsIgnoreCase("Plovdiv")) {
            if (product.equalsIgnoreCase("coffee")) {
                result = quantity * 0.4;
            } else if (product.equalsIgnoreCase("water")) {
                result = quantity * 0.7;
            } else if (product.equalsIgnoreCase("beer")) {
                result = quantity * 1.15;
            } else if (product.equalsIgnoreCase("sweets")) {
                result = quantity * 1.30;
            } else if (product.equalsIgnoreCase("peanuts")) {
                result = quantity * 1.50;
            }
        } else if (town.equalsIgnoreCase("Varna")) {
            if (product.equalsIgnoreCase("coffee")) {
                result = quantity * 0.45;
            } else if (product.equalsIgnoreCase("water")) {
                result = quantity * 0.7;
            } else if (product.equalsIgnoreCase("beer")) {
                result = quantity * 1.10;
            } else if (product.equalsIgnoreCase("sweets")) {
                result = quantity * 1.35;
            } else if (product.equalsIgnoreCase("peanuts")) {
                result = quantity * 1.55;
            }
        }
        if (result < 0){
            System.out.println("invalid data");
        }else {
            System.out.println(result);
        }
    }
}