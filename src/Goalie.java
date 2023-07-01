public class Goalie implements Player {
    private String name;
    private Integer age;
    private Integer wins;

    public Goalie(String name, Integer age, Integer wins) {
        this.name = name;
        this.age = age;
        this.wins = wins;
    }

    public Goalie() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    public Integer getWins() {
        return wins;
    }
}