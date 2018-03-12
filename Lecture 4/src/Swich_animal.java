import java.util.Scanner;

public class Swich_animal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        if ("word".equalsIgnoreCase("word2"))
            switch (word) {
                case "dog":
                    System.out.println("mammal");
                    break;
                case "crocodile":
                    System.out.println("reptile");
                    break;
                case "tortoise":
                    System.out.println("reptile");
                    break;
                case "snake":
                    System.out.println("reptile");
                    break;
                default:
                    System.out.println("unknown");
                    break;
            }

    }
}