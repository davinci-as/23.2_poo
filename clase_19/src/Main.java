import estadisticas.Match;
import estadisticas.Player;
import estadisticas.Team;

public class Main {
    public static void main(String[] args) {
        Team argentina = new Team("Argentina", 4, 3);
        Team francia = new Team("Francia", 0, 0);


        new Player("Angel Di Maria", 7, "Delantero", argentina);
        new Player("Lionel Messi", 10, "Delantero", argentina);
        new Player("Emiliano Martinez", 1, "Arquero", argentina);

        new Player("antoine griezmann", 7, "Delantero", francia);
        new Player("Kylian mbappe", 10, "Delantero", francia);
        new Player("Hugo lloris", 1, "Arquero", francia);

        argentina.showPlayersList();

        Match finalMatch = new Match(argentina, francia);

        finalMatch.incrementLocalGoals();
        finalMatch.incrementVisitantGoals();
        finalMatch.incrementLocalGoals();




    }
}