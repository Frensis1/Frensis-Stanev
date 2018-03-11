import java.util.Scanner;

public class Fruit_shop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double banana = 2.50;
        double apple = 1.20;
        double orange = 0.85;
        double grapefruit = 1.45;
        double kiwi = 2.70;
        double pineapple = 5.50;
        double grapes = 3.85;
        double price = -1;
        if (day.equalsIgnoreCase("Sunday") || day.equalsIgnoreCase("Saturday")) {
            banana = 2.70;
            apple = 1.25;
            orange = 0.90;
            grapefruit = 1.60;
            kiwi = 3.00;
            pineapple = 5.60;
            grapes = 4.20;
        }
        if (fruit.equalsIgnoreCase("banana")) {
            price = banana * quantity;
        } else if (fruit.equalsIgnoreCase("apple")) {
            price = apple * quantity;
        } else if (fruit.equalsIgnoreCase("orange")) {
            price = orange * quantity;
        } else if (fruit.equalsIgnoreCase("grapefruit")) {
            price = grapefruit * quantity;
        } else if (fruit.equalsIgnoreCase("kiwi")) {
            price = kiwi * quantity;
        } else if (fruit.equalsIgnoreCase("pineapple")) {
            price = pineapple * quantity;
        } else if (fruit.equalsIgnoreCase("grapes")) {
            price = grapes * quantity;
        }
        if (price<0||((!day.equalsIgnoreCase("Monday"))
                &&(!day.equalsIgnoreCase("Tuesday"))
                &&(!day.equalsIgnoreCase("Wednesday"))
                &&(!day.equalsIgnoreCase("Thursday"))
                &&(!day.equalsIgnoreCase("Sunday"))
                &&(!day.equalsIgnoreCase("Saturday"))
                &&(!day.equalsIgnoreCase("Friday"))))
                {
            System.out.println("error");
    }else{
            System.out.println(price);
        }

    }

}

