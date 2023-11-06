import estadisticas.Match;
import estadisticas.Player;
import estadisticas.Team;

public class Main {
    public static void main(String[] args) {
        Team argentina = new Team("Argentina", 4, 3);
        Team francia = new Team("Francia", 0, 0);


        Player fideo = new Player("Angel Di Maria", 7, "Delantero", argentina);
        Player messi = new Player("Lionel Messi", 10, "Delantero", argentina);
        Player dibu = new Player("Emiliano Martinez", 1, "Arquero", argentina);

        Player griezmann = new Player("antoine griezmann", 7, "Delantero", francia);
        Player mbbappe = new Player("Kylian mbappe", 10, "Delantero", francia);
        Player lloris = new Player("Hugo lloris", 1, "Arquero", francia);

        argentina.showPlayersList();

        Match finalMatch = new Match();
        finalMatch.setLocalTeam(argentina);
        finalMatch.setVisitantTeam(francia);

        finalMatch.incrementLocalGoals();
        finalMatch.incrementVisitantGoals();
        finalMatch.incrementLocalGoals();




    }
}