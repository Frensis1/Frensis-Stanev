import java.util.Scanner;

public class rectangle_10_X_10_Stars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int row = 0; row <10 ; row++) {
            for (int col = 0; col <10 ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
