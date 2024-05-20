package BEE2312;

public class Nation implements Comparable<Nation>{

    private String name;
    private Integer gold;
    private Integer silver;
    private Integer bronze;

    public Nation(String name, Integer gold, Integer silver, Integer bronze) {
        this.name = name;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public Integer getSilver() {
        return silver;
    }

    public void setSilver(int silver) {
        this.silver = silver;
    }

    public Integer getBronze() {
        return bronze;
    }

    public void setBronze(int bronze) {
        this.bronze = bronze;
    }

    @Override
    public int compareTo(Nation o) {
        int compare =o.getGold().compareTo(this.getGold());
        if(compare ==0) {
            compare = o.getSilver().compareTo(this.getSilver());
        }
        if(compare ==0) {
            compare = o.getBronze().compareTo(this.getBronze());
        }
        if(compare ==0) {
            compare = this.getName().compareTo(o.getName());
        }
        return compare;
    }
}
