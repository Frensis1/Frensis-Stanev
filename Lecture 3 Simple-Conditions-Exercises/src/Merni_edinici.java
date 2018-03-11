import java.util.Scanner;

public class Merni_edinici {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number:");
        Scanner input = new Scanner(System.in);
        double num = Double.parseDouble(input.nextLine());
        String from = input.nextLine();
        String to = input.nextLine();
        double x = 0;
        double n = 0;
// convert to [m]
        if (from.equals("mm")) {
            x = num / 1000;
        } else if (from.equals("cm")) {
            x = num / 100;
        } else if (from.equals("mi")) {
            x = num / 0.000621371192;
        } else if (from.equals("in")) {
            x = num / 39.3700787;
        } else if (from.equals("km")) {
            x = num / 0.001;
        } else if (from.equals("ft")) {
            x = num / 3.2808399;
        } else if (from.equals("yd")) {
            x = num / 1.0936133;
        } else if (from.equals("m")) {
            x = num;
        }
//convert from [m]
        if (to.equals("mm")) {
            n = x * 1000;
        } else if (to.equals("cm")) {
            n = x * 100;
        } else if (to.equals("mi")) {
            n = x * 0.000621371192;
        } else if (to.equals("in")) {
            n = x * 39.3700787;
        } else if (to.equals("km")) {
            n = x * 0.001;
        } else if (to.equals("ft")) {
            n = x * 3.2808399;
        } else if (to.equals("yd")) {
            n = x * 1.0936133;
        } else if (to.equals("m")) {
            n = x;
        }
        System.out.printf("%.8f %s", n, to);

    }
}