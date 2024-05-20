package BEE2312;


import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int index = entrada.nextInt();

        OlympicChart olympicChart = new OlympicChart();
        for(int i = 0; i < index; i++){
            String nome = entrada.next();
            String[] values = entrada.nextLine().split(" ");

            int gold =  Integer.parseInt(values[1]);
            int silver = Integer.parseInt(values[2]);
            int bronze = Integer.parseInt(values[3]);

            olympicChart.addNation(new Nation(nome, gold,silver,bronze ));
        }
        Collections.sort(olympicChart.getNationsList());
        for(Nation x: olympicChart.getNationsList()){
            System.out.printf("%s %d %d %d\n",x.getName(),x.getGold(),x.getSilver(),x.getBronze());
        }
    }
}
