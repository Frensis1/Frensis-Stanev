import java.util.Scanner;

public class odd_Even_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int even_Sum = 0;
        int odd_Sum = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                even_Sum += number;
            }else{
                odd_Sum+=number;
            }
        }
        if (even_Sum==odd_Sum){
            System.out.printf("Yes Sum = %d",odd_Sum);
        }else {
            System.out.printf("No, Diff = %d",Math.abs(even_Sum-odd_Sum));
        }
    }
}
