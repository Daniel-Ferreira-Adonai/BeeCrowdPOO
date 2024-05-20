package BEE1110;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int index = entrada.nextInt();
        while (index != 0) {
            LinkedList<Integer> deck = new LinkedList<>();
            LinkedList<Integer> descarte = new LinkedList<>();

            for (int i = 0; i < index; i++) {
                deck.add(i + 1);

            }

            int i = 0;
            while (deck.size() != 1) {
                descarte.add(deck.getFirst());
                deck.removeFirst();
                int aux = 0;

                aux = deck.getFirst();
                deck.removeFirst();
                deck.addLast(aux);

                i++;
            }
            System.out.print("Discarded cards:");
            for(Integer x: descarte){
                if(x == descarte.getLast()){
                    System.out.print(" "  + x+"\n");
                }
                else {
                    System.out.print(" " + x + ",");
                }
            }
            System.out.print("Remaining card:");
            for(Integer x: deck){
                System.out.println(" " + x );
            }
            if(entrada.hasNextInt()){
                index = entrada.nextInt();
            }
            else{
                index = 0;
            }
        }
    }
}
