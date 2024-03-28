package BEE1043;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double value1 = entrada.nextDouble();
        double value2 = entrada.nextDouble();
        double value3 = entrada.nextDouble();

        if(value1 + value2 > value3 && value2 + value3 > value1 && value3 + value1 > value2) {
            Triangle triangle = new Triangle(value1, value2, value3);
            System.out.printf("Perimetro = %.1f\n", triangle.calcula());
        }
        else{
            Trapezium trapezium = new Trapezium(value1, value2, value3);
            System.out.printf("Area = %.1f\n", trapezium.calcula());
        }
    }
}