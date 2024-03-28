package BEE1049;

public class Vaca extends Animal {



    public Vaca(String animalType, String classe, String foodType) {
        super(animalType, classe, foodType);

    }

    @Override
    public String toString() {
        return "vaca";
    }
}