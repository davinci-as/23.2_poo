package estadisticas;

import java.util.ArrayList;

public class Llave extends Season{
    public ArrayList<Team> getNextStepTeams() {
        ArrayList<Team> winners = new ArrayList<Team>();
        ArrayList<Match> matches = getMatches();

        for (int i = 0; i < matches.size(); i++) {
            Match actualMatch = matches.get(i);
            if(actualMatch.isVisitantWinner()) {
                winners.add(actualMatch.getVisitantTeam());
            } else if(actualMatch.isLocalWinner()) {
                winners.add(actualMatch.getLocalTeam());
            } else {
                //TODO: acá va la lógica de los penales
                winners.add(actualMatch.getVisitantTeam());
            }
        }

        return winners;
    }

    public void generateMatches() {
        int cantidadEquipos = this.getTeams().size();
        int cantidadPartidos = cantidadEquipos / 2;
        for(int i = 0; i < cantidadPartidos; i++) {
            this.addMatch(new Match(
                    this.getTeams().get(i*2),
                    this.getTeams().get((i*2) + 1))
            );
        }
    }
}
