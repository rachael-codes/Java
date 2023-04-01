package Number_guessing_game;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        System.out.println("\n\033[36m~~Welcome to GUESS THE NUMBER game~~");

        // Data (create players)
        Player player1 = new Player("Rachael");
        Player player2 = new Player("John");
        Player player3 = new Player("Maria");

        // Generate random magic number
        int magicNumber = (int) (Math.random() * 20);

        // Keep playing until someone wins
        while (true) {
            // Ask each player for their guess
            player1.guess();
            player2.guess();
            player3.guess();

            // Check if anyone guessed the magic number
            if (player1.number == magicNumber || player2.number == magicNumber || player3.number == magicNumber) {
                System.out.println("\n\033[32mCongratulations, someone guessed the magic number!");
                if (player1.number == magicNumber) {
                    System.out.println(player1.name + " wins!");
                }
                if (player2.number == magicNumber) {
                    System.out.println(player2.name + " wins!");
                }
                if (player3.number == magicNumber) {
                    System.out.println(player3.name + " wins!");
                }
                break;
            } else {
                System.out.println("\n\033[31mNo one guessed the magic number. Try again.");
            }
        }
    }
}

class Player {
    String name;
    int number;

    public Player(String name) {
        this.name = name;
    }

    public void guess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\033[35m" + name + ", guess a number between 0 and 20: ");
        number = scanner.nextInt();
    }
}