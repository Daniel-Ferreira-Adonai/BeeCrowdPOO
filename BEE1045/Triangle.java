package BEE1045;

public abstract class Triangle {

    Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    protected double side1;

    protected double side2;

    protected double side3;

    public abstract String toString();

}
