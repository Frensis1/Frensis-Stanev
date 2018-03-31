import java.util.Scanner;

public class Latin_Letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        for (int i = 97; i <=122; i++) {
//            System.out.println((char)i);             кастване става ,но не е редно,само когато сме сигурни какво имаме на входа
//        for (char i = 97; i <=122; i++) {
//            System.out.println(i);
        for (char letter = 'a'; letter <= 'z'; letter++) {
            System.out.println(""+letter);
        }
    }
}

