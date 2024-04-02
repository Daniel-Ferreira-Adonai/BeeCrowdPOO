package BEE2286;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Player player1 = new Player();
        Player player2 = new Player();
        Match match = new Match();
        int j = 1;
        while (true) {
            int times = entrada.nextInt();
            if (times == 0) {
                break;
            }
            System.out.println("Teste "+j);
            j += 1;


            player1.setName(entrada.next());
            player2.setName(entrada.next());
            for (int i = 0; i < times; i++) {
                match.evenOrOdd(player1, player2, entrada.nextInt(), entrada.nextInt());
            }

            System.out.println();
        }
    }
}
