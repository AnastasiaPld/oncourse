package com.homework;

import lombok.Getter;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

@Getter
public class footballTeam {

    private List<Players> nameOfPlayers;
    private String name;

    public footballTeam() {
        this.nameOfPlayers = new ArrayList<>();
    }

    public footballTeam(String name) {
        this();
        this.setName(name);
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name can not be empty!");
        }
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void addPlayer(Players player) {
        this.nameOfPlayers.add(player);
    }

    public void removePlayer(String name) {
        Players playersToRemove = this.nameOfPlayers.stream().filter(players -> players.getName().equals(name)).findFirst().orElseThrow(InvalidParameterException::new);
this.nameOfPlayers.remove(playersToRemove);
    }
    public double getRating (){
        return this.nameOfPlayers.stream().mapToDouble(Players::overallSkillLevel).sum();
    }
}
