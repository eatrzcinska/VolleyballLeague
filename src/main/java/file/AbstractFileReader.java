package file;

import model.Player;
import model.Team;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

abstract class AbstractFileReader {

    private static String PATH = "C:\\Users\\martr\\IdeaProjects\\VolleyballLeague";

    abstract List<String> read(String path) throws IOException;

    File getFile(String path) {
        if (path == null) {
            throw new IllegalArgumentException("May not be null!");
        }
        path = PATH + "\\" + path;
        return Paths.get(path).toFile();
    }

    List <Player> getPlayersList (String path) throws IOException {

        List <Player> playerList = new ArrayList<>();
        List <String> stringList = read(path);

        for (String line : stringList) {
            String[] information = line.split(";");
            Player player = new Player(information[0], information[1], information[2]);
            playerList.add(player);
        }
        return playerList;
    }

    List <Team> getTeamsList (String path) throws IOException {
        List <Team> teamList = new ArrayList<>();
        List <String> stringList = read(path);

        for (String line : stringList) {
            Team team = new Team(line);
            teamList.add(team);
        }
        return teamList;
    }





}
