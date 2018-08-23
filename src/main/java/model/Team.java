package model;

import file.FileFacade;

import java.util.ArrayList;
import java.util.List;

public class Team {

    String name;
    List<Player> players;

    public Team(String name) {
        this.name = name;
        players = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void addPlayer (Player player){
        players.add(player);
        player.setTeam(this);

    }


}
