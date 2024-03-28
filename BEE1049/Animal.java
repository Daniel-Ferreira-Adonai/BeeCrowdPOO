package BEE1049;

public abstract class Animal {

    public Animal(String animalType, String classe, String foodType) {
        this.animalType = animalType;
        this.classe = classe;
        this.foodType = foodType;
    }

    protected String animalType;

    protected String classe;

    protected String foodType;


    public abstract String toString();

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }
}
