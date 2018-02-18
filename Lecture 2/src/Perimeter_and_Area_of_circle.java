import java.util.Scanner;

public class Perimeter_and_Area_of_circle {
    public static void main(String[] args) {
        Scanner consloe = new Scanner (System.in);
        double r = Double.parseDouble(consloe.nextLine());
      Double area = Math.PI*r*r;
      Double perimeter = 2*Math.PI*r;
        System.out.printf("Area = %.2f %n",area);
        System.out.printf("Perimeter = %.2f",perimeter);
    }
}
