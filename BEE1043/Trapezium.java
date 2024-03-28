package BEE1043;

public class Trapezium extends Polygon{

    public Trapezium(){

    }
    public Trapezium(double value1, double value2, double value3){
        super(value1, value2, value3);
    }

    @Override
    public double calcula(){
        return ((value1 + value2) * value3) / 2;
    }
}
