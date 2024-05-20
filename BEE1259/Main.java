package BEE1259;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        int index = entrada.nextInt();
        for(int i = 0; i < index; i++){
            int value = entrada.nextInt();
            if((value % 2) == 0){
                even.add(value);
            }
            else{
                odd.add(value);
            }
        }
        Collections.sort(even);
        odd.sort((x,y) -> y.compareTo(x));
        for(Integer x: even){
            System.out.println(x);
        }
        for(Integer x: odd){
            System.out.println(x);
        }
    }
}
