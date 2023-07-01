public class Defender implements Player {
    private String name;
    private Integer age;
    private Integer hits;

    public Defender(String name, Integer age, Integer hits) {
        this.name = name;
        this.age = age;
        this.hits = hits;
    }

    public Defender() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    public Integer getHits() {
        return hits;
    }
}