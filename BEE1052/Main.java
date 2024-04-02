package BEE1052;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calendary calendary = new Calendary();
        System.out.println(calendary.getMonth(entrada.nextInt()));
    }
}