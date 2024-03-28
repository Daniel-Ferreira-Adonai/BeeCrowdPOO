package BEE2059;

public class Player {

    private String evenOrOdd;

    private int fingerValues;

    private int cheatingOrAcuse;

    Player(){

    }
    Player(int fingerValues){
        this.fingerValues = fingerValues;

    }

    Player(int fingerValues, int cheatingOrAcuse){
        this.fingerValues = fingerValues;
        this.cheatingOrAcuse = cheatingOrAcuse;
    }
    Player(int evenOrOdd, int fingerValues, int cheatingOrAcuse) {
        if(evenOrOdd == 1) {
            this.evenOrOdd = "even";
        }
        else{
            this.evenOrOdd = "odd";
        }
        this.fingerValues = fingerValues;
        this.cheatingOrAcuse = cheatingOrAcuse;
    }


    public void setEvenOrOdd(String evenOrOdd){
        this.evenOrOdd = evenOrOdd;
    }
    public String getEvenOrOdd(){
        return this.evenOrOdd;
    }
    public void setFingerValues(int fingerValues){
        this.fingerValues = fingerValues;

    }
    public int getFingerValues(){
        return this.fingerValues;
    }

    public int getCheatingOrAcuse() {
        return cheatingOrAcuse;
    }

    public void setCheatingOrAcuse(int cheatingOrAcuse) {
        this.cheatingOrAcuse = cheatingOrAcuse;
    }
}
