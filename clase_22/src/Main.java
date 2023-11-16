import estadisticas.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static String[][] generatePlayer() {
        String[][] jugadores = new String[2][2];

        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i][0] = JOptionPane.showInputDialog("por favor el nombre del jugador que usa la camiseta: " + (i+1));
            jugadores[i][1] = JOptionPane.showInputDialog("por favor ingrese la posición de: " + jugadores[i][0]);
        }

        return jugadores;
    }
    public static void main(String[] args) {
        Llave semiFinalMundial = new Llave(); // 4 equipos, 2 partidos, 2 equipos ganadores (Arg y francia)
        // así agrego los equipos
        semiFinalMundial.addTeam(new Team("Argentina"));
        semiFinalMundial.addTeam(new Team("Croacia"));
        semiFinalMundial.addTeam(new Team("Francia"));
        semiFinalMundial.addTeam(new Team("Marruecos"));

        // cargo los equipos
        for (int j = 0; j < semiFinalMundial.getTeams().size(); j++) {
            JOptionPane.showMessageDialog(null,
                    "Vamos a cargar los jugadores de : " + semiFinalMundial.getTeams().get(j).getName()
            );
            String[][] jugadores = generatePlayer();
            for (int i = 0; i < jugadores.length; i++) {
                new Player(jugadores[i][0], i + 1, jugadores[i][1], semiFinalMundial.getTeams().get(j));
            }
        }

        //generar los partidos
        semiFinalMundial.addMatch(new Match(
                semiFinalMundial.getTeams().get(0),
                semiFinalMundial.getTeams().get(1))
        ); //Arg vs croacia
        semiFinalMundial.addMatch(new Match(
                semiFinalMundial.getTeams().get(2),
                semiFinalMundial.getTeams().get(3)
        ));

        //jugar partidos
        Match semi1 = semiFinalMundial.getMatches().get(0); //Arg vs croacia
        semi1.incrementLocalGoals();
        semi1.incrementLocalGoals();
        semi1.incrementLocalGoals();

        Match semi2 = semiFinalMundial.getMatches().get(1); //Francia vs Marruecos
        semi2.incrementLocalGoals();
        semi2.incrementLocalGoals();


        //Creo Season
        Llave fasefinalMundial = new Llave();
        //Cargue los equipos desde la fase anterior
        // fasefinalMundial <-- semiFinalMundial::getNextStepTeams
        fasefinalMundial.setTeams(semiFinalMundial.getNextStepTeams());

        //Generar partidos
        fasefinalMundial.addMatch(new Match(
                fasefinalMundial.getTeams().get(0),
                fasefinalMundial.getTeams().get(1))
        ); //Arg vs Francia

        //Jugaar los partidos
        Match finalMatch = fasefinalMundial.getMatches().get(0);
        finalMatch.incrementLocalGoals();

        //Resultado final
        fasefinalMundial.getNextStepTeams().forEach(team -> {
            team.showPlayersList();
        });


    }
}