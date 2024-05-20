package BEE1118;


import java.util.LinkedList;


public class ScoreList {
    private LinkedList<Double> Scorelist = new LinkedList<>();


    public void add(Double score){
        this.Scorelist.add(score);
    }
    public LinkedList<Double> getScorelist(){
        return this.Scorelist;
    }


}
