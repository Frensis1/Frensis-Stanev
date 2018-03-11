import java.util.Scanner;

public class Fruit_shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit  = scanner.nextLine();
        String day =scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        if ((day.equalsIgnoreCase("Monday")
                || day.equalsIgnoreCase("Tuesday")
                || day.equalsIgnoreCase("Wednesday")
                ||day.equalsIgnoreCase("Thursday")
                || day.equalsIgnoreCase("Friday"))
                && (fruit.equalsIgnoreCase("banana"))) {
            System.out.println(quantity * 2.50);
        } else if ((day.equalsIgnoreCase("Monday")
                || day.equalsIgnoreCase("Tuesday")
                || day.equalsIgnoreCase("Wednesday")
                || day.equalsIgnoreCase("Thursday")
                || day.equalsIgnoreCase("Friday"))
                && (fruit.equalsIgnoreCase("apple"))) {
            System.out.println(quantity * 1.20);
        } else if ((day.equalsIgnoreCase("Monday")
                || day.equalsIgnoreCase("Tuesday")
                || day.equalsIgnoreCase("Wednesday")
                || day.equalsIgnoreCase("Thursday")
                || day.equalsIgnoreCase("Friday"))
                && (fruit.equalsIgnoreCase("orange"))) {
            System.out.println(quantity * 0.85);
        } else if ((day.equalsIgnoreCase("Monday")
                || day.equalsIgnoreCase("Tuesday")
                || day.equalsIgnoreCase("Wednesday")
                || day.equalsIgnoreCase("Thursday")
                || day.equalsIgnoreCase("Friday"))
                && (fruit.equalsIgnoreCase("grapefruit"))) {
            System.out.println(quantity * 1.45);
        } else if ((day.equalsIgnoreCase("Monday")
                || day.equalsIgnoreCase("Tuesday")
                || day.equalsIgnoreCase("Wednesday")
                || day.equalsIgnoreCase("Thursday")
                || day.equalsIgnoreCase("Friday"))
                && (fruit.equalsIgnoreCase("kiwi"))) {
            System.out.println(quantity * 2.70);
        } else if ((day.equalsIgnoreCase("Monday")
                || day.equalsIgnoreCase("Tuesday")
                || day.equalsIgnoreCase("Wednesday")
                || day.equalsIgnoreCase("Thursday")
                || day.equalsIgnoreCase("Friday"))
                && (fruit.equalsIgnoreCase("pineapple"))) {
            System.out.println(quantity * 5.50);
        } else if ((day.equalsIgnoreCase("Monday")
                || day.equalsIgnoreCase("Tuesday")
                || day.equalsIgnoreCase("Wednesday")
                || day.equalsIgnoreCase("Thursday")
                || day.equalsIgnoreCase("Friday"))
                && (fruit.equalsIgnoreCase("grapes"))) {
            System.out.println(quantity * 3.85);



        }  else if ((day.equalsIgnoreCase("Saturday")
                || day.equalsIgnoreCase("Sunday"))
                && (fruit.equalsIgnoreCase("apple"))) {
            System.out.println(quantity * 1.25);
        } else if ((day.equalsIgnoreCase("Saturday")
                || day.equalsIgnoreCase("Sunday"))
                && (fruit.equalsIgnoreCase("orange"))) {
            System.out.println(quantity * 0.90);
        } else if ((day.equalsIgnoreCase("Saturday")
                || day.equalsIgnoreCase("Sunday"))
                && (fruit.equalsIgnoreCase("grapefruit"))) {
            System.out.println(quantity * 1.60);
        } else if ((day.equalsIgnoreCase("Saturday")
                || day.equalsIgnoreCase("Sunday"))
                && (fruit.equalsIgnoreCase("kiwi"))) {
            System.out.println(quantity * 3.00);
        } else if ((day.equalsIgnoreCase("Saturday")
                || day.equalsIgnoreCase("Sunday"))
                && (fruit.equalsIgnoreCase("pineapple"))) {
            System.out.println(quantity * 5.60);
        } else if ((day.equalsIgnoreCase("Saturday")
                || day.equalsIgnoreCase("Sunday"))
                && (fruit.equalsIgnoreCase("grapes"))) {
            System.out.println(quantity * 4.20);
        }else if ((day.equalsIgnoreCase("Saturday")
                || day.equalsIgnoreCase("Sunday"))
                && (fruit.equalsIgnoreCase("banana"))) {
            System.out.println(quantity * 2.70);
        }else{
            System.out.println("error");
        }
    }
}