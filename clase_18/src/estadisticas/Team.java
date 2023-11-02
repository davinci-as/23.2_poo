package estadisticas;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;
    private int tableScore;
    private int goalCounter;

    public Team() {
        this.players = new ArrayList<Player>();
    }

    public Team(String name) {
        this.players = new ArrayList<Player>();
        this.setName(name);
    }

    public Team(String name, int goalCounter, int tableScore) {
        this.players = new ArrayList<Player>();
        this.setName(name);
        this.setGoalCounter(goalCounter);
        this.setTableScore(tableScore);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        getPlayers().add(player);
    }

    public void removePlayer(Player player) {
        getPlayers().remove(player);
    }

    public int getTableScore() {
        return tableScore;
    }

    public void setTableScore(int tableScore) {
        this.tableScore = tableScore;
    }

    public int getGoalCounter() {
        return goalCounter;
    }

    public void setGoalCounter(int goalCounter) {
        this.goalCounter = goalCounter;
    }
}
