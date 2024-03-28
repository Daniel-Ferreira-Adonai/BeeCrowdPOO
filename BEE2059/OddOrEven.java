package BEE2059;

public class OddOrEven {
    protected Player player1;

    protected Player player2;

    OddOrEven(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
    }
    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public String startGame(){
    int fingerSum = player1.getFingerValues() + player2.getFingerValues();
    if(fingerSum % 2 == 0 && player1.getEvenOrOdd().equals("even")) {
        return "Jogador 1 ganha!";
    }
    else if(fingerSum % 2 != 0 && player1.getEvenOrOdd().equals("odd")) {
            return "Jogador 1 ganha!";
        }
    else{
        return "Jogador 2 ganha!";
    }
    }

}
