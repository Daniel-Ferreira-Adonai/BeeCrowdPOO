package BEE2167;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        EngineRelatory engineRelatory = new EngineRelatory();
        Engine engine = new Engine();
        int loop = entrada.nextInt();
        for(int i = 0; i < loop; i++){
            engine.setEngineSpeed(entrada.nextInt());
            engineRelatory.addEngineValue(engine.getEngineSpeed());
        }






        System.out.println(engineRelatory.firstFall());




    }





}
