package BEE2061;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Browser chromedFox = new Browser(entrada.nextInt());
        int times = entrada.nextInt();
        for (int i = 0; i < times ; i++) {
            String command = entrada.next();
            chromedFox.clickOrClose(command);
        }
        System.out.println(chromedFox.getTabs());
    }
}