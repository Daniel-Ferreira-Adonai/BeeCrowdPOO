package BEE1258;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int loop = entrada.nextInt();



        while (loop != 0) {
            entrada.nextLine(); // Its giving me presetation error : (
            List<TshirtOrder> tshirtOrderList = new ArrayList<>();

            for (int i = 0; i < loop; i++) {
                String nome = entrada.nextLine();
                String[] rest = entrada.nextLine().split(" ");
                TshirtOrder order = new TshirtOrder(nome, rest[0], rest[1]);
                tshirtOrderList.add(order);

            }
            Collections.sort(tshirtOrderList, (order1, order2) -> {
                int colorComparison = order1.getColor().compareTo(order2.getColor());
                if (colorComparison != 0) {
                    return colorComparison;
                }
                int sizeComparison = order2.getSize().compareTo(order1.getSize());
                if (sizeComparison != 0) {
                    return sizeComparison;
                }
                return order1.getName().compareTo(order2.getName());
            });
            for(TshirtOrder x: tshirtOrderList){
                System.out.println(x.getColor() + " " + x.getSize() + " " + x.getName());
            }
            loop = entrada.nextInt();
            if(loop != 0) {
                System.out.println();
            }
        }

    }
}
