package BEE1244;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int index = entrada.nextInt();
        entrada.nextLine();

        List<List<String>> sets = new ArrayList<>();

        for (int i = 0; i < index; i++) {
            String[] palavras = entrada.nextLine().split(" ");
            sets.add(Arrays.asList(palavras));
        }

        sets.forEach(set -> {
            Collections.sort(set, (x, y) -> {
                int compareLength = Integer.compare(y.length(), x.length());
                return compareLength ;
            });

            for (int i = 0; i < set.size(); i++) {
                System.out.print(set.get(i));
                if (i < set.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        });
    }
}