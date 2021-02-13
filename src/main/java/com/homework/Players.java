package com.homework;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Players {

    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Players(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        this.setName(name);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
        this.setEndurance(endurance);
        this.setSprint(sprint);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name can not be empty!");
        }
        this.name = name;

    }

    private void setEndurance (int endurance){
        if (endurance>100) {
            throw new IllegalArgumentException("Endurance should be between 0 and 100");
        }
        this.endurance= endurance;
    }
    private void setSprint (int sprint){
        if (sprint>100) {
            throw new IllegalArgumentException("Sprint should be between 0 and 100");
        }
        this.sprint= sprint;
    }
    private void setDribble (int dribble){
        if (dribble>100) {
            throw new IllegalArgumentException("Dribble should be between 0 and 100");
        }
        this.dribble= dribble;
    }
    private void setShooting (int shooting){
        if (shooting>100) {
            throw new IllegalArgumentException("Shooting should be between 0 and 100");
        }
        this.shooting= shooting;
    }
    private void setPassing (int passing){
        if (passing>100) {
            throw new IllegalArgumentException("Passing should be between 0 and 100");
        }
        this.passing= passing;
    }
    private static boolean isValidStat (int skillLevel){
        if (skillLevel<0 || skillLevel>100) {
            return false;
        }
        public double overallSkillLevel{
            return ((double);
        }
    }
    }


