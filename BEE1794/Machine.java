package BEE1794;

public abstract class Machine {

    protected int min;

    protected int max;

    public Machine(){

    }
    public Machine(int min, int max){
        this.min = min;
        this.max= max;
    }

    public void setMin(int min) {
        this.min = min;
    }
    public int getMin() {
        return this.min;
    }
    public void setMax(int max){
        this.max = max;
    }
    public int getMax(){
        return this.max;
    }

    public abstract int capacityCheck(int A);
}
