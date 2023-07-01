package entities;

import interfaces.Player;

public class Forward implements Player {
    private String name;
    private Integer age;
    private Integer goals;

    public Forward(String name, Integer age, Integer goals) {
        this.name = name;
        this.age = age;
        this.goals = goals;
    }

    public Forward() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    public Integer getGoals() {
        return goals;
    }

}