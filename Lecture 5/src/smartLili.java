import java.util.Scanner;

public class smartLili {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liliAge = Integer.parseInt(scanner.nextLine());
        double priceWM = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());
        int money = 0;
        int toyQuantity = 0;
        int sum = 0;
        int save = 0;
        for (int i = 1; i <= liliAge; i++) {
            if (i % 2 != 0) {
                toyQuantity++;
            } else {

                sum += 10;
                save += sum - 1;// we take 1 ,because here brother takes 1lv each time
            }
        }
        double result = (save + (toyQuantity * priceToy));
        if (result > priceWM) {
            System.out.printf("Yes ! %.2f", result - priceWM);
        } else {
            System.out.printf("No ! %.2f", priceWM - result);
        }
    }
}
