package BEE2174;


import java.util.LinkedHashSet;
import java.util.Set;

public class Pomedex {
    private Set<String> pomedex = new LinkedHashSet<>();

    private int TotalPomedexSize = 151;

    public Set<String> getPomedex() {
        return pomedex;
    }
    public void addPomedex(String pomekonName){
        this.pomedex.add(pomekonName);
    }
    public int getPomedexSize(){
        return this.TotalPomedexSize;
    }
    public int howManyPokemonsLeft(){
        return this.TotalPomedexSize - this.pomedex.size() ;
    }
}
