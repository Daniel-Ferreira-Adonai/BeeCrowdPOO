package BEE2312;

import java.util.ArrayList;
import java.util.List;

public class OlympicChart {

    private List<Nation> nationsList = new ArrayList<>();

    public void addNation(Nation nation) {
        nationsList.add(nation);
    }

    public List<Nation> getNationsList() {
        return nationsList;
    }
}
