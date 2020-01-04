package ua.ihorshulha.ht_09.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<TeamPlayer> teamPlayers = new ArrayList<>();

    public void addTeamPlayer(TeamPlayer teamPlayer){
        teamPlayers.add(teamPlayer);
    }

    public void removeTeamPlayer(TeamPlayer teamPlayer){
        teamPlayers.remove(teamPlayer);
    }

    public void doWork(){
        System.out.println("Team are doing teamwork...");
        for(TeamPlayer teamPlayer : teamPlayers){
            teamPlayer.work();
        }
    }
}
