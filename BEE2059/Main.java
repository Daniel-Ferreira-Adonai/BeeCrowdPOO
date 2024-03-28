package BEE2059;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int oddOrEven = entrada.nextInt();
        int player1Fingers = entrada.nextInt();
        int player2Fingers = entrada.nextInt();
        int player1Cheating = entrada.nextInt();
        int player2Acussing = entrada.nextInt();
        Player player1 = new Player(oddOrEven, player1Fingers, player1Cheating);
        Player player2 = new Player(player2Fingers, player2Acussing);

        OddEvenOrCheating game = new OddEvenOrCheating(player1, player2);

        System.out.println(game.startGame());
    }

}
