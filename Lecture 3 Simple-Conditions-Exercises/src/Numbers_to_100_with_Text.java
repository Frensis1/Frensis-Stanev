import java.util.Scanner;

public class Numbers_to_100_with_Text {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (number == 1) {
            System.out.println("one");
        }
        if (number == 0) {
            System.out.println("zero");
        }
        if (number == 2) {
            System.out.println("two");
        }
        if (number == 3) {
            System.out.println("three");
        }
        if (number == 4) {
            System.out.println("four");
        }
        if (number == 5) {
            System.out.println("five");
        }
        if (number == 6) {
            System.out.println("six");
        }
        if (number == 7) {
            System.out.println("seven");
        }
        if (number == 8) {
            System.out.println("eight");
        }
        if (number == 9) {
            System.out.println("nine");
        }
        if (number == 10) {
            System.out.println("ten");
        }
        if (number == 11) {
            System.out.println("eleven");
        }
        if (number == 12) {
            System.out.println("twelve");
        }
        if (number == 13) {
            System.out.println("thirteen");
        }
        if (number == 14) {
            System.out.println("fourteen");
        }
        if (number == 15) {
            System.out.println("fifteen");
        }
        if (number == 16) {
            System.out.println("sixteen");
        }
        if (number == 17) {
            System.out.println("seventeen");
        }
        if (number == 18) {
            System.out.println("eighteen");
        }
        if (number == 19) {
            System.out.println("nineteen");
        }
        if (number == 100) {
            System.out.print("one hundred");
        }
        if (number / 10 == 2) {
            System.out.print("twenty");
        }
        if (number / 10 == 3) {
            System.out.print("thirty");
        }
        if (number / 10 == 4) {
            System.out.print("forty");
        }
        if (number / 10 == 5) {
            System.out.print("fifty");
        }
        if (number / 10 == 6) {
            System.out.print("sixty");
        }
        if (number / 10 == 7) {
            System.out.print("seventy");
        }
        if (number / 10 == 8) {
            System.out.print("eighty");
        }
        if (number / 10 == 9) {
            System.out.print("ninety");
        }
        if (number > 20  && number<100 && number % 10 == 1) {
            System.out.print(" one");
        }
        if (number > 20  && number<100 &&  number % 10 == 2) {
            System.out.print(" two");
        }
        if (number > 20 && number<100 && number % 10 == 3) {
            System.out.print(" three");
        }
        if (number > 20  && number<100 && number % 10 == 4) {
            System.out.print(" four");
        }
        if (number > 20  && number<100 && number % 10 == 5) {
            System.out.print(" five");
        }
        if (number > 20  && number<100 && number % 10 == 6) {
            System.out.print(" six");
        }
        if (number > 20  && number<100 && number % 10 == 7) {
            System.out.print(" seven");
        }
        if (number > 20  && number<100 && number % 10 == 8) {
            System.out.print(" eight");
        }
        if (number > 20  && number<100 && number % 10 == 9) {
            System.out.print(" nine");
        }
         if (number > 100) {
             System.out.print("invalid number");
         }
         if (number<0){
                 System.out.println("invalid number");
             }
        }
    }
