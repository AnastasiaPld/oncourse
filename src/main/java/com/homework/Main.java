package com.homework;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String, footballTeam> teams = new LinkedHashMap<>();
        String input = reader.readLine();

        while(!input.equals("End")){
            String[]lines = input.split(";");

            if (lines [0].equals("Team")){
                try{
                    footballTeam team= new footballTeam(lines[1]);
                    teams.put(lines[1],new footballTeam(lines[1]));
                } catch (InvalidParameterException ex){
                    System.out.println(ex.getMessage());
                }
            }else if (lines[0].equals("Add")){
                footballTeam team = teams.get(lines[1]);
                if (team==null) {
                    System.out.printf("Team %s doesnt exist.%n", lines[1]);
                } else {
                    try{
                        Players player =new Players(lines[2],
                        Integer.parseInt(lines[3]),
                        Integer.parseInt(lines[4]),
                        Integer.parseInt(lines[5]),
                        Integer.parseInt(lines[6]),
                        Integer.parseInt(lines[7]),
                        Integer.parseInt(lines[8]),
                        Integer.parseInt(lines[9]),
                        team.addPlayer();

                }
            }
        }


        Map<String, Players> people = new LinkedHashMap<>();
        Map<Integer, Stats> stat = new LinkedHashMap<>();
        Map<String, footballTeam> team = new LinkedHashMap<>();

        //Team;Barcelona
        String[] peopleTokens = reader.readLine().split("[;]");

        String[] footballTeam = reader.readLine().split("[;]");

        String[] footballTeam1 = reader.readLine().split("[;]");

        for (int i = 0 i < peopleTokens.length; )


            ArrayList<String> arrayList = new ArrayList<String>(5);


    }

}

