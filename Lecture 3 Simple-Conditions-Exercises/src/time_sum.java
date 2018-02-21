import java.util.Scanner;

public class time_sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int firstperson = Integer.parseInt(input.nextLine());
            int secondperson = Integer.parseInt(input.nextLine());
            int thirdperson = Integer.parseInt(input.nextLine());

            int sumOfTime = firstperson + secondperson + thirdperson;
            int seconds = sumOfTime % 60;
            int minutes = sumOfTime / 60;
            if (seconds < 10) {
                System.out.printf("%d:0%d",minutes,seconds);
            } else {
                System.out.printf("%d:%d",minutes,seconds);
            }
        }
    }
