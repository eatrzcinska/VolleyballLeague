package model;

import java.util.List;

public class Player {
    String firstname;
    String lastname;
    Team team;
    String info;

    public Player(String firstname, String lastname, String info) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.info = info;
    }

    public String getInfo(){
        return info;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String showPlayer (){
        String playerInfo= "Player: " + firstname +" " + lastname + ", " + team.name;
        return playerInfo;
    }
}
