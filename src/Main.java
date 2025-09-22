import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();

    public static void main(String[] args) {

        // HiLo - Guessing game


         runHiLo(random);

    }

    private static void runHiLo(Random random) {

            System.out.println();
            System.out.println("Välkommen till HiLo");
            System.out.println("Vilken nivå vill du köra?");
            System.out.println();
            String easy = "Lätt";
            String medium = "Mellan";
            String hard = "Svår";
            System.out.println(1 + ": " + easy);
            System.out.println(2 + ": " + medium);
            System.out.println(3 + ": " + hard);
            System.out.println();
            System.out.println("Ditt val:");

            String level = in.nextLine().toLowerCase();


            if (level.equalsIgnoreCase(easy) || level.equals("1")) {
                levelEasy(random);
            } else if (level.equalsIgnoreCase(medium) || level.equals("2")) {
                levelMedium(random);
            } else if (level.equalsIgnoreCase(hard) || level.equals("3")) {
                levelHard(random);
            } else {
                System.out.println("Ogiltigt val. Välj igen");
                runHiLo(random);
            }

            menu();
    }

    private static void menu() {
            System.out.println("_______________________");
            System.out.println("Vill du spela igen?");
            System.out.println("1. Ja");
            System.out.println("2. Nej");
            int choice = in.nextInt();
            in.nextLine();

            switch(choice) {
                case 1:
                    runHiLo(random);
                    break;
                case 2:
                    break;
                default:
            }


    }



    private static void levelEasy(Random random) {
        int computerChoice = random.nextInt(1, 11);
        System.out.println("--------------------");
        System.out.println("Du valde nivå: Lätt");
        System.out.println("Gissa mitt hemliga tal.. 1-10");

        int guessCount = 0;
        boolean playing = true;

        while (playing) {
            int playerGuess = in.nextInt();

            if (playerGuess < computerChoice) {
                System.out.println("Högre");
                guessCount++;
            } else if (playerGuess > computerChoice) {
                System.out.println("Lägre");
                guessCount++;
            } else {
                playing = false;
                guessCount++;
                System.out.println("Rätt!");
                System.out.println("Antal gissningar: "+guessCount);
            }
        }
    }

    private static void levelMedium(Random random) {
        int computerChoice = random.nextInt(1, 101);
        System.out.println("--------------------");
        System.out.println("Du valde nivå: Mellan");
        System.out.println("Gissa mitt hemliga tal.. 1-100");

        int guessCount = 0;
        boolean playing = true;

        while (playing) {
            int playerGuess = in.nextInt();

            if (playerGuess < computerChoice) {
                System.out.println("Högre");
                guessCount++;
            } else if (playerGuess > computerChoice) {
                System.out.println("Lägre");
                guessCount++;
            } else {
                playing = false;
                guessCount++;
                System.out.println("Rätt!");
                System.out.println("Antal gissningar: "+guessCount);
            }
        }
    }

    private static void levelHard(Random random) {
        int computerChoice = random.nextInt(1, 1001);
        System.out.println("--------------------");
        System.out.println("Du valde nivå: Svår");
        System.out.println("Gissa mitt hemliga tal.. 1-1000");

        int guessCount = 0;
        boolean playing = true;

        while (playing) {
            int playerGuess = in.nextInt();

            if (playerGuess < computerChoice) {
                System.out.println("Högre");
                guessCount++;
            } else if (playerGuess > computerChoice) {
                System.out.println("Lägre");
                guessCount++;
            } else {
                playing = false;
                guessCount++;
                System.out.println("Rätt!");
                System.out.println("Antal gissningar: "+guessCount);
            }
        }
    }
}