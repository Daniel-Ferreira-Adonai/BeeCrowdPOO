package BEE1794;

public class DryeMachine extends Machine {

    public DryeMachine(int min, int max) {
        super(min, max);
    }

    @Override
    public int capacityCheck(int clothes) {
        if (clothes >= min && clothes <= max) {
            return 1;
        } else {
            return 0;
        }
    }
}
