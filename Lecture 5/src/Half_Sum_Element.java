import java.util.Scanner;

public class Half_Sum_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int max =  Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < n; i++) {
            int number =Integer.parseInt(scanner.nextLine());
            sum+=number;
            if (number>max){
                max=number;
            }
        }
        if (sum-max==max){
            System.out.printf("Yes Sum - %d",max);
        }else{
            int result=Math.abs(max-(sum-max));
            System.out.printf("No Diff - %d",result);
        }
    }
}
