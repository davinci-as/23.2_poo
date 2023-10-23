import estadisticas.Player;
import estadisticas.Team;

public class Main {
    public static void main(String[] args) {
        Team argentina = new Team();
        argentina.setName("Argentina");
        argentina.setGoalCounter(0);
        argentina.setTableScore(0);

        Player messi = new Player();
        messi.setName("Lionel Messi");
        messi.setNumber(10);
        messi.setPosition("Delantero");
        messi.setGoalCounter(0);
        messi.setTeam(argentina);
    }
}