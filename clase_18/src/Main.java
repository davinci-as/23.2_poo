import estadisticas.Player;
import estadisticas.Team;

public class Main {
    public static void main(String[] args) {
        Team argentina = new Team("Argentina", 4, 3);

        Player fideo = new Player("Angel Di Maria", 7, "Delantero", argentina);
        Player messi = new Player("Lionel Messi", 10, "Delantero", argentina);
        Player dibu = new Player("Emiliano Martinez", 1, "Arquero", argentina);

        messi.addPlayerToTeamList(messi);
        fideo.addPlayerToTeamList(fideo);
        dibu.addPlayerToTeamList(dibu);

        System.out.println(messi.getTeam().getName());
    }
}