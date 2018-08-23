package file;

import model.Player;
import model.Team;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class FileFacade {

    private BufferedFileReader reader = new BufferedFileReader();

    public List<Player> getPlayersList (String path){
        try {
            return reader.getPlayersList(path);
        } catch (IOException e) {
            return Collections.emptyList();
        }
    }

    public List <Team> getTeamsList (String path){
        try {
            return reader.getTeamsList(path);
        } catch (IOException e) {
            return Collections.emptyList();
        }
    }

}
