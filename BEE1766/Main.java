package BEE1766;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        int index = entrada.nextInt();
        for(int i = 0; i < index; i ++){
            System.out.printf("CENARIO {%d}\n", (i+1));
            int reideerCount = entrada.nextInt();
            int printCount = entrada.nextInt();

            List<Reindeer> reindeerList = new ArrayList<>();
            for(int j = 0; j < reideerCount;j++){
                String nome = entrada.next();

                Integer weight = entrada.nextInt();

                Integer age = entrada.nextInt();

                Double height = entrada.nextDouble();

                Reindeer reindeer = new Reindeer(nome,weight,age,height);
                reindeerList.add(reindeer);
            }
            Collections.sort(reindeerList);
            for(int y = 0; y < printCount; y++) {
                System.out.printf("%d - %s\n",(y+1), reindeerList.get(y).getNome());
            }
        }
    }
}
