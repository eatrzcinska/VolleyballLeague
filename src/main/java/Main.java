import file.FileFacade;
import model.Player;
import model.Team;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        FileFacade fileFacade = new FileFacade();

        List<Player> playerList = fileFacade.getPlayersList("VolleyballLeague.txt");
        List<Team> teamList = fileFacade.getTeamsList("Teams.txt");

        for(Team team: teamList){
            for(Player player: playerList){
                if (player.getInfo().equals(team.getName())) {
                    team.addPlayer(player);
                    System.out.println(player.showPlayer());
                } else {continue;}
            }

        }
    }
}
