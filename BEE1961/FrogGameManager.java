package BEE1961;

import java.util.ArrayList;
import java.util.List;

class FrogGameManager {
    private Frog frog;
    private List<Integer> pipeValues = new ArrayList<>();

    FrogGameManager(Frog frog){
        this.frog = frog;
    }
    public void addPipeValues(int pipeValues){
        this.pipeValues.add(pipeValues);
    }
    public String GameResult(){
        int FrogJumpHeigh = this.frog.getJumpHeight();
        int difference;
        int lastValue = this.pipeValues.get(0);
        for(Integer x: pipeValues){
            if(x > lastValue){
                difference = x - lastValue ;
            }
            else{
                difference = lastValue - x; ;
            }
            if(difference > FrogJumpHeigh){
                return "GAME OVER";
            }
            lastValue = x;
        }
        return "YOU WIN";
    }
}