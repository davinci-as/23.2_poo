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
        String[] equipos = {"Argentina", "Croacia", "Francia", "Marruecos"};
        ArrayList<Team> equiposQueAvanzanSemi = generarEquipos(equipos);

        Llave semiFinalMundial = new Llave(); // 4 equipos, 2 partidos, 2 equipos ganadores (Arg y francia)
        semiFinalMundial.setTeams(equiposQueAvanzanSemi);
        semiFinalMundial.generateMatches();

        Match semi1 = semiFinalMundial.getMatches().get(0); //Arg vs croacia
        semi1.incrementLocalGoals();
        semi1.incrementLocalGoals();
        semi1.incrementLocalGoals();

        Match semi2 = semiFinalMundial.getMatches().get(1); //Francia vs Marruecos
        semi2.incrementLocalGoals();
        semi2.incrementLocalGoals();


        //Creo Season
        Llave fasefinalMundial = new Llave();
        fasefinalMundial.setTeams(semiFinalMundial.getNextStepTeams());
        fasefinalMundial.generateMatches();

        //Jugaar los partidos
        Match finalMatch = fasefinalMundial.getMatches().get(0);
        finalMatch.incrementLocalGoals();

        //Resultado final
        fasefinalMundial.getNextStepTeams().forEach(team -> {
            team.showPlayersList();
        });


    }

    private static ArrayList<Team> generarEquipos(String[] equipos) {
        ArrayList<Team> equiposQueAvanzanSemi = new ArrayList<>();
        for(String equipo: equipos) {
            Team nuevoEquipo = new Team(equipo);
            String[][] jugadores = generatePlayer();

            equiposQueAvanzanSemi.add(nuevoEquipo);
            JOptionPane.showMessageDialog(null,
                    "Vamos a cargar los jugadores de : " + equipo
            );
            for (int i = 0; i < jugadores.length; i++) {
                new Player(jugadores[i][0], i + 1, jugadores[i][1], nuevoEquipo);
            }
        }
        return equiposQueAvanzanSemi;
    }
}