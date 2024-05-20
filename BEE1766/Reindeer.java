package BEE1766;

public class Reindeer implements Comparable<Reindeer> {
    private String nome;

    private  Integer weight;

    private Integer age;

    private Double height;

    public Reindeer(String nome, Integer weight, Integer age, Double height) {
        this.nome = nome;
        this.weight = weight;
        this.age = age;
        this.height = height;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public int compareTo(Reindeer o) {
        int compare = o.weight.compareTo(this.getWeight());
        if(compare == 0) {
            compare = this.age.compareTo(o.getAge());
        }
        if(compare == 0) {
            compare = this.height.compareTo(o.getHeight());
        }
        if(compare == 0) {
            compare = this.nome.compareTo(o.getNome());
        }
        return compare;
    }
}
