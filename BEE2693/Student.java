package BEE2693;

public class Student implements Comparable<Student> {
   private String name;
    private  String region;

    private  Integer distance;

    public Student(String name, String region, Integer distance) {
        this.name = name;
        this.region = region;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    @Override
    public int compareTo(Student o) {
        int compare = this.distance.compareTo(o.getDistance());
        if(compare == 0) {
            compare =this.region.compareTo(o.getRegion());
        }
        if(compare ==0) {
            compare = this.name.compareTo(o.getName());
        }
        return compare;
    }
}
