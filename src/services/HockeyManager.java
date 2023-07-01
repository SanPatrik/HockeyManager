package services;

import entities.Defender;
import entities.Forward;
import entities.Goalie;
import interfaces.Player;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HockeyManager {
    private List<Player> players;

    public HockeyManager() {
        this.players = new ArrayList<>();
    }

    public void addNewForward(String name, Integer age, Integer goals) {
        players.add(new Forward(name, age, goals));
    }

    public void addNewDefender(String name, Integer age, Integer hits) {
        players.add(new Defender(name, age, hits));
    }

    public void addNewGoalie(String name, Integer age, Integer wins) {
        players.add(new Goalie(name, age, wins));
    }

    public void printNameAndAgeOfTheYoungestPlayer() {
        if (players.isEmpty()) {
            System.out.println("No players available.");
            return;
        }

        Player youngestPlayer = players.stream()
                .min(Comparator.comparingInt(Player::getAge))
                .orElse(null);

        System.out.println("Youngest player: " + youngestPlayer.getName());
        System.out.println("Age: " + youngestPlayer.getAge());
    }

}
