package BEE2174;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Pomedex pomedex = new Pomedex();
    int loop = entrada.nextInt();
    for(int i = 0; i < loop; i++){
        Pomekon pomekon = new Pomekon(entrada.next());
        pomedex.addPomedex(pomekon.getName());
    }
        System.out.printf("Falta(m) %d pomekon(s).\n",pomedex.howManyPokemonsLeft());
    }
}
