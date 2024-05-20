package BEE1118;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        ScoreList scoreList = new ScoreList();
        double value;
        Integer check = null;
        while(true) {
            while (scoreList.getScorelist().size() != 2) {
                try {
                    value = entrada.nextDouble();
                    if (value < 0 || value > 10)
                        throw new ScoreException("nota invalida");
                    scoreList.add(value);

                } catch (ScoreException e) {
                    System.out.println(e.getMessage());
                }

            }
            if(check == null){
                System.out.printf("media = %.2f", ((scoreList.getScorelist().getFirst() + scoreList.getScorelist().getLast()) / 2));
            }

             check = entrada.nextInt();

            if(check == 2) {
                System.out.println("novo calculo (1-sim 2-nao)");
                break;
           }
           else if(check == 1) {
                System.out.println("novo calculo (1-sim 2-nao)");
               scoreList = new ScoreList();
               check = null;
            }
           else{
                System.out.println("novo calculo (1-sim 2-nao)");
            }
        }
        }

}
