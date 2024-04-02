package BEE1052;

import java.util.ArrayList;
import java.util.List;

public class Calendary {

    private List<String> calendary = new ArrayList<>();


    Calendary(){
        this.calendary.add("January");
        this.calendary.add("February");
        this.calendary.add("March");
        this.calendary.add("April");
        this.calendary.add("May");
        this.calendary.add("June");
        this.calendary.add("July");
        this.calendary.add("August");
        this.calendary.add("September");
        this.calendary.add("October");
        this.calendary.add("November");
        this.calendary.add("December");











    }

    public List<String> getCalendary(){
        return this.calendary;
    }
    public String getMonth(int month){
        return calendary.get(month - 1);
    }
}
