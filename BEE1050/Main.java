package BEE1050;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Ddd ddd = new Ddd();
        System.out.println(ddd.dddToDestination(entrada.nextInt()));
    }
}
