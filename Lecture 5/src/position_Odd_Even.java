import java.text.DecimalFormat;
import java.util.Scanner;

public class position_Odd_Even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double OddSum = 0;
        double OddMin = (double) Integer.MAX_VALUE;
        double OddMax = (double) Integer.MIN_VALUE;
        double EvenSum = 0;
        double EvenMin = (double) Integer.MAX_VALUE;
        double EvenMax = (double) Integer.MIN_VALUE;
        double n = Double.parseDouble(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0) {
                EvenSum += number;
                if (EvenMax < number) {
                    EvenMax = number;
                }
                if (EvenMin > number) {
                    EvenMin = number;
                }
            } else {
                OddSum += number;
                if (OddMax < number) {
                    OddMax = number;
                }
                if (OddMin > number) {
                    OddMin = number;

                }
            }

        }
        if (OddMax == (double) Integer.MIN_VALUE) {
            DecimalFormat df = new DecimalFormat("#.##########");
            System.out.printf("OddSum=%s%n", df.format(OddSum));
            System.out.printf("OddMin=%s%n", "No");
            System.out.printf("OddMax=%s%n", "No");
            System.out.printf("EvenSum=%s%n", df.format(EvenSum));
            System.out.printf("EvenMin=%s%n", "No");
            System.out.printf("EvenMax=%s%n", "No");
        }else if (EvenMax == (double) Integer.MIN_VALUE){
            DecimalFormat df = new DecimalFormat("#.##########");
            System.out.printf("OddSum=%s%n", df.format(OddSum));
            System.out.printf("OddMin=%s%n", df.format(OddMin));
            System.out.printf("OddMax=%s%n", df.format(OddMax));
            System.out.printf("EvenSum=%s%n",df.format(EvenSum));
            System.out.printf("EvenMin=%s%n", "No");
            System.out.printf("EvenMax=%s%n", "No");
        } else {
            DecimalFormat df = new DecimalFormat("#.##########");
            System.out.printf("OddSum=%s%n", df.format(OddSum));
            System.out.printf("OddMin=%s%n", df.format(OddMin));
            System.out.printf("OddMax=%s%n", df.format(OddMax));
            System.out.printf("EvenSum=%s%n", df.format(EvenSum));
            System.out.printf("EvenMin=%s%n", df.format(EvenMin));
            System.out.printf("EvenMax=%s%n", df.format(EvenMax));
        }
    }
}