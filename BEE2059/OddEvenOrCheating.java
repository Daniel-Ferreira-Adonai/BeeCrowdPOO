package BEE2059;

public class OddEvenOrCheating extends OddOrEven {

    OddEvenOrCheating(Player player1, Player player2) {
        super(player1, player2);
    }

    @Override
    public String startGame() {
        int fingerSum = player1.getFingerValues() + player2.getFingerValues();
        if (fingerSum % 2 == 0 && player1.getEvenOrOdd().equals("even")) {
            if (player1.getCheatingOrAcuse() == 0 & player2.getCheatingOrAcuse() == 0) {
                return "Jogador 1 ganha!";
            } else if (player1.getCheatingOrAcuse() == 1 & player2.getCheatingOrAcuse() == 0) {
                return "Jogador 1 ganha!";
            } else if (player1.getCheatingOrAcuse() == 0 & player2.getCheatingOrAcuse() == 1) {
                return "Jogador 1 ganha!";
            }
            else if (player1.getCheatingOrAcuse() == 1 & player2.getCheatingOrAcuse() == 1) {
                return "Jogador 2 ganha!";
            }
            else{ return "nada";}
        }
        else if (fingerSum % 2 != 0 && player1.getEvenOrOdd().equals("even")) {
            if (player1.getCheatingOrAcuse() == 1 & player2.getCheatingOrAcuse() == 0) {
                return "Jogador 1 ganha!";
            } else if (player1.getCheatingOrAcuse() == 1 & player2.getCheatingOrAcuse() == 1) {
                return "Jogador 2 ganha!";

            }
            else if (player1.getCheatingOrAcuse() == 0 & player2.getCheatingOrAcuse() == 0) {
                return "Jogador 2 ganha!"; }
            else{ return "nada";}
        }
        else if (fingerSum % 2 != 0 && player1.getEvenOrOdd().equals("odd")) {
            if (player1.getCheatingOrAcuse() == 0 & player2.getCheatingOrAcuse() == 0) {
                return "Jogador 1 ganha!";
            } else if (player1.getCheatingOrAcuse() == 1 & player2.getCheatingOrAcuse() == 0) {
                return "Jogador 1 ganha!";
            } else if (player1.getCheatingOrAcuse() == 0 & player2.getCheatingOrAcuse() == 1) {
                return "Jogador 1 ganha!";
            }
            else if (player1.getCheatingOrAcuse() == 1 & player2.getCheatingOrAcuse() == 1) {
                return "Jogador 2 ganha!";
            }
            else{ return "nada";}
        }
        else if (fingerSum % 2 == 0 && player1.getEvenOrOdd().equals("odd")) {
            if (player1.getCheatingOrAcuse() == 0 & player2.getCheatingOrAcuse() == 0) {
                return "Jogador 2 ganha!";
            } else if (player1.getCheatingOrAcuse() == 1 & player2.getCheatingOrAcuse() == 0) {
                return "Jogador 1 ganha!";
            } else if (player1.getCheatingOrAcuse() == 0 & player2.getCheatingOrAcuse() == 1) {
                return "Jogador 1 ganha!";
            } else if (player1.getCheatingOrAcuse() == 1 & player2.getCheatingOrAcuse() == 1) {
                return "Jogador 2 ganha!";
            }
            else{ return "nada";}
        }
        else{ return "nada";}


    }
}