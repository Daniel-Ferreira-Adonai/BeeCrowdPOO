package BEE2693;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int index = entrada.nextInt();

        while(index != 0) {
            Van van = new Van();
            entrada.nextLine();
            for (int i = 0; i < index; i++) {
                String[] values = entrada.nextLine().split(" ");
                Student student = new Student(values[0], values[1], Integer.parseInt(values[2]));
                van.addStudent(student);
            }
            Collections.sort(van.getStudentsList());
            for (Student x : van.getStudentsList()) {
                System.out.println(x.getName());
            }
            if(entrada.hasNextInt()) {
                index = entrada.nextInt();
            }
            else{
                index = 0;
            }
        }
    }
}
