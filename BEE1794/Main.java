package BEE1794;
import BEE1794.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        var clothes = entrada.nextInt();

        WashingMachine washingMachine = new WashingMachine(entrada.nextInt(), entrada.nextInt());
        DryeMachine dryeMachine = new DryeMachine(entrada.nextInt(), entrada.nextInt());

        if(washingMachine.capacityCheck(clothes) == 1 && dryeMachine.capacityCheck(clothes) == 1){
            System.out.println("possivel");
        }
        else{
            System.out.println("impossivel");
        }

    }
}