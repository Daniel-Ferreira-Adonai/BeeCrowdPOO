package BEE2479;

public class Kid implements Comparable<Kid> {
    private String behavior;
    private String name;

    public Kid(String behavior, String name) {
        this.behavior = behavior;
        this.name = name;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Kid o) {
        return this.name.compareTo(o.getName());
    }
}
