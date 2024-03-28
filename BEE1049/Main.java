package BEE1049;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    for(int i = 0; i < 8; i++) {
            identificaECriaAnimal(entrada.nextLine(), entrada.nextLine(),entrada.nextLine());
        }




    }













    public static void identificaECriaAnimal(String animalType, String classe, String foodType){
        if(animalType.equals("vertebrado") && classe.equals("mamifero") && foodType.equals("onivoro")) {
            Homem homem = new Homem(animalType,classe,foodType);
            System.out.println(homem);
        }
        else if(animalType.equals("vertebrado") && classe.equals("mamifero") && foodType.equals("herbivoro")) {
            Vaca vaca = new Vaca(animalType,classe,foodType);
            System.out.println(vaca);
        }
        else if(animalType.equals("vertebrado") && classe.equals("ave") && foodType.equals("carnivoro")){
            Aguia aguia = new Aguia(animalType,classe,foodType);
            System.out.println(aguia);

        }
        else if(animalType.equals("vertebrado") && classe.equals("ave") && foodType.equals("onivoro")){
            Pomba pomba = new Pomba(animalType,classe,foodType);
            System.out.println(pomba);
        }
        else if(animalType.equals("invertebrado") && classe.equals("inseto") && foodType.equals("hematofago")){
            Pulga pulga = new Pulga(animalType,classe,foodType);
            System.out.println(pulga);
        }
        else if(animalType.equals("invertebrado") && classe.equals("inseto") && foodType.equals("herbivoro")){
            Lagarta lagarta = new Lagarta(animalType,classe,foodType);
            System.out.println(lagarta);
        }
        else if(animalType.equals("invertebrado") && classe.equals("anelideo") && foodType.equals("hematofago")){
            Sanguessuga sanguessuga = new Sanguessuga(animalType,classe,foodType);
            System.out.println(sanguessuga);
        }
        else if(animalType.equals("invertebrado") && classe.equals("anelideo") && foodType.equals("onivoro")){
            Minhoca minhoca = new Minhoca(animalType,classe,foodType);
            System.out.println(minhoca);
        }
    }

}


