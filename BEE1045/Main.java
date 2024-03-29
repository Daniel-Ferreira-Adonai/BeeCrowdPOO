package BEE1045;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Double> lista = new ArrayList<>();
         lista.add(entrada.nextDouble());
        lista.add(entrada.nextDouble());
        lista.add(entrada.nextDouble());
        Collections.sort(lista);
        double side1 = lista.get(2);
        double side2 = lista.get(1);
        double side3 = lista.get(0);
        createTriangle(side1,side2,side3);

    }

public static void createTriangle(double side1, double side2, double side3){
        if(side1 >= side2 + side3) {
            System.out.println("NAO FORMA TRIANGULO");
            return;
        }
        if(Math.pow(side1,2) == Math.pow(side2,2) + Math.pow(side3,2)) {
            TriangleRetangulo triangleRetangulo = new TriangleRetangulo(side1, side2, side3);
            System.out.println(triangleRetangulo);
        }
        if(Math.pow(side1,2) > Math.pow(side2,2) + Math.pow(side3,2)) {
            TriangleObtusangulo triangleObtusangulo = new TriangleObtusangulo(side1, side2, side3);
            System.out.println(triangleObtusangulo);

        }
        if(Math.pow(side1,2) < Math.pow(side2,2) + Math.pow(side3,2)) {
            TriangleAcutangulo triangleAcutangulo = new TriangleAcutangulo(side1, side2, side3);
            System.out.println(triangleAcutangulo);

        }
        if(side1 == side2 && side1 == side3) {
            TriangleEquilatero triangleEquilatero = new TriangleEquilatero(side1, side2, side3);
            System.out.println(triangleEquilatero);

        }
        if(side1 == side2 && side1 != side3 || side1 == side3 && side1 != side2 || side2 == side3 && side2 != side1){
            TriangleIsosceles triangleIsoceles = new TriangleIsosceles(side1,side2,side3);
            System.out.println(triangleIsoceles);
        }

}

}


