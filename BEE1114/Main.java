package BEE1114;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int value = 0;
        while(value != 2002) {
            try {
                value = entrada.nextInt();
                if(value != 2002)
                    throw new PasswordException("Senha Invalida");
                    Password password = new Password(value);
                    System.out.println("Acesso Permitido");
            }
            catch(PasswordException e){
                System.out.println(e.getMessage());
            }
        }

    }

}
