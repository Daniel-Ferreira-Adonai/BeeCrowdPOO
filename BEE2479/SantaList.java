package BEE2479;

import java.util.ArrayList;
import java.util.List;

public class SantaList {
    private int behave;
    private int unbehave;
    private List<Kid> santaList = new ArrayList<>();

    public List<Kid> getSantaList() {
        return santaList;
    }
    public void addBehave(){
        this.behave++;
    }
    public void addUnbehave(){
        this.unbehave++;
    }
    public int getBehave() {
        return behave;
    }

    public int getUnbehave() {
        return unbehave;
    }

    public void addKid(Kid kid) {
       this.santaList.add(kid);
    }
}
