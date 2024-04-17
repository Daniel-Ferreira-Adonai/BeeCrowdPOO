package BEE2167;

import java.util.ArrayList;
import java.util.List;

public class EngineRelatory {

    private List<Integer> EngineRelatory = new ArrayList<>();

    EngineRelatory() {

    }

    public void addEngineValue(int value) {
        this.EngineRelatory.add(value);
    }

    public List<Integer> getEngineRelatory() {
        return this.EngineRelatory;
    }

    public int firstFall() {
        int lastValue = this.EngineRelatory.get(0);

        int i = 1;
        for(Integer x : this.EngineRelatory){
        if(x < lastValue){


            return i;


        }
        i++;
        lastValue = x;
        }
    return 0;
    }

}