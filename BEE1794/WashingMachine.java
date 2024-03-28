package BEE1794;

import BEE1794.Machine;

public class WashingMachine extends Machine {





    public WashingMachine(int min, int max) {
        super(min, max);
    }
    @Override
    public int capacityCheck(int clothes){
        if(clothes >= min && clothes <= max) {
            return 1;
        }
        else{
            return 0;
        }
    }
}
