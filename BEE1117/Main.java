package BEE1117;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ScoreList scoreList = new ScoreList();
        double value;

        while(scoreList.getScorelist().size() != 2) {
            try {
                value = entrada.nextDouble();
                if(value < 0 || value > 10)
                    throw new ScoreException("nota invalida");
                    scoreList.add(value);

            }
            catch(ScoreException e){
                System.out.println(e.getMessage());
            }

        }
        System.out.printf("media = %.2f", ((scoreList.getScorelist().getFirst() + scoreList.getScorelist().getLast()) / 2) );
    }

}
