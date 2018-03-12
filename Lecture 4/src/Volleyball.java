import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String yearType = scanner.nextLine();
        int holidaysDays = Integer.parseInt(scanner.nextLine());
        int homeGame = Integer.parseInt(scanner.nextLine());

        double sofiaGame = (48 - homeGame) * 3.0 / 4;
        double holidaysGames = holidaysDays * 2.0 / 3;
        double allGames = sofiaGame + holidaysGames + homeGame;
        double bonusGames=0;
        if (yearType.equalsIgnoreCase("leap")){
            bonusGames=allGames*0.15;
        }
        allGames+=bonusGames;
        System.out.printf("%.0f",Math.floor(allGames));
}
}
