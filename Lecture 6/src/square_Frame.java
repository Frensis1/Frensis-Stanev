import java.util.Scanner;

public class square_Frame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

//        top
        System.out.print("+");
        for (int i = 0; i <n-2 ; i++) {
            System.out.print(" -");
        }
        System.out.println(" +");


        for (int row = 0; row <n-2 ; row++) {
            System.out.print("|");
            for (int col = 0; col < n-2; col++) {
                System.out.print(" -");
            }
            System.out.println(" |");
        }
        
        
        

//        bottom
        System.out.print("+");
        for (int i = 0; i <n-2 ; i++) {
            System.out.print(" -");
        }
        System.out.println(" +");
    }
}
