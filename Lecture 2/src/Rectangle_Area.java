import java.util.Scanner;
import java.util.SortedMap;

public class Rectangle_Area {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        double x1 = Double.parseDouble(console.nextLine());
        double x2 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());
        double SideOne = Math.abs(x1-y1);
        double Sidetwo =Math.abs (x2-y2);
        double area = SideOne*Sidetwo;
        double perimeter= 2*(SideOne+Sidetwo);
        System.out.println(area);
        System.out.println(perimeter);

    }
}
