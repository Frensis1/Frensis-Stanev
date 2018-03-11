import java.util.Scanner;

public class Personal_titles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        if (gender.equals("f") && age < 16) {
            System.out.println("Miss");
        }else if (gender.equals("f") && age >= 16){
                System.out.println("Ms.");
        }else if (gender.equals("m") && age < 16)
            System.out.println("Master");
            else
                System.out.println("Mr.");
        }
    }

