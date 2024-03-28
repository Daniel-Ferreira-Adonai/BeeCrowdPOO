package BEE1043;

public class Triangle extends Polygon {

    public Triangle(){

    }
    public Triangle(double value1, double value2, double value3){
        super(value1, value2, value3);
    }
    @Override
    public double calcula() {
        return value1 + value2 + value3;
    }
}
