package BEE1049;

public  class Homem extends Animal {


    public Homem(String animalType, String classe, String foodType) {
        super(animalType, classe, foodType);

    }

    @Override
    public String toString() {
        return "homem";
    }
}