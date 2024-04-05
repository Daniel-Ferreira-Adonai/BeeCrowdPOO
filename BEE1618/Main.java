package BEE1618;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int loop = entrada.nextInt();


        PlanoCardeal planoCardeal = new PlanoCardeal();
        for(int i = 0 ; i < loop; i++){
            int Ax = entrada.nextInt();
            int Ay = entrada.nextInt();
            int Bx = entrada.nextInt();
            int By = entrada.nextInt();
            int Cx = entrada.nextInt();
            int Cy = entrada.nextInt();
            int Dx = entrada.nextInt();
            int Dy  = entrada.nextInt();
            int Rx  = entrada.nextInt();
            int Ry  = entrada.nextInt();
            Robo robo = new Robo();
            robo.setPosicaoX(Rx);
            robo.setPosicaoY(Ry);
            System.out.println(planoCardeal.verificaRobo(Ax, Ay, Bx, By, Cx, Cy, Dx, Dy, robo.getPosicaoX(), robo.getPosicaoY()));

        }


    }
}
