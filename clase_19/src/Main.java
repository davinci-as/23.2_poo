import estadisticas.Match;
import estadisticas.Player;
import estadisticas.Season;
import estadisticas.Team;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Season faseGrupoMundial = new Season();
        Team argentina = new Team("Argentina", 4, 3);
        Team francia = new Team("Francia", 0, 0);

        faseGrupoMundial.addTeam(argentina);
        faseGrupoMundial.addTeam(francia);

        new Player("Emiliano Martinez", 1, "Arquero", argentina);
        new Player("Angel Di Maria", 7, "Delantero", argentina);
        new Player("Lionel Messi", 10, "Delantero", argentina);

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