package BEE2479;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        SantaList santaList = new SantaList();
        int index = entrada.nextInt();
        entrada.nextLine();
        for(int i = 0; i < index; i++){
            String[] data = entrada.nextLine().split(" ");
            santaList.addKid(new Kid(data[0],data[1]));
        }
        Collections.sort(santaList.getSantaList());
        for(Kid x: santaList.getSantaList()){
            if(x.getBehavior().equals("+")){
                santaList.addBehave();
            }
            else{
                santaList.addUnbehave();
            }
            System.out.println(x.getName());
        }
        System.out.printf("Se comportaram: %d | Nao se comportaram: %d\n", santaList.getBehave(),santaList.getUnbehave());
    }
}
