package BEE1043;

public abstract class Polygon {


    protected double value1;

    protected double value2;

    protected double value3;

    public double getValue1() {
        return value1;
    }

    public Polygon(){

    }
    public Polygon(double value1, double value2, double value3){
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }


    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    public double getValue3() {
        return value3;
    }

    public void setValue3(double value3) {
        this.value3 = value3;
    }
    public abstract double calcula();
}
