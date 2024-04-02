package BEE2286;

class Match {


    public void evenOrOdd(Player player1, Player player2, int fingers1, int fingers2) {
        player1.setFingers(fingers1);
        player2.setFingers(fingers2);
        int result =  player1.getFingers() - player2.getFingers();
        if(result < 0) {
            result = result * -1;
        }
        if(result % 2 == 0) {
            System.out.println(player1.getName());

        }
        else {
            System.out.println(player2.getName());

        }
    }
}