package BEE1961;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Frog frog = new Frog(entrada.nextInt());
        FrogGameManager frogGameManager = new FrogGameManager(frog);
        int loop = entrada.nextInt();
        for(int i = 0; i < loop; i++){
            Pipe pipe = new Pipe(entrada.nextInt());

            frogGameManager.addPipeValues(pipe.getHeight());
        }
        System.out.println(frogGameManager.GameResult());
    }
}
