import java.util.ArrayList;
import java.util.List;

class DivingLeadboards{

    private List<Double> list = new ArrayList<Double>();

    public DivingLeadboards(){

    }
    public void addToLeadboardList(double value){
        this.list.add(value);
    }
    public List<Double> getList(){
        return this.list;
    }
    public void removeHighestScore(){
        double HighestScore = 0;
        for(Double x: this.list){
            if(x > HighestScore){
                HighestScore = x;
            }
        }
        this.list.remove(HighestScore);
    }
    public void removeLowestScore(){
        double lowestScore = this.list.get(0);
        for(Double x: this.list){
            if(x < lowestScore){
                lowestScore = x;
            }
        }
        this.list.remove(lowestScore);

    }
    public double LeadboardTotalValue(double factor){
    double sum = 0;
    for(Double x: this.list){
    sum += x;
    }
    return sum * factor;
    }

}