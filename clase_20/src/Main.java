import estadisticas.Match;
import estadisticas.Player;
import estadisticas.Season;
import estadisticas.Team;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static String[][] generateArgPlayer() {
        String[][] jugadoresArgentina = new String[10][2];

        // Asignar los nombres de los jugadores
        jugadoresArgentina[0][0] = "Lionel Messi";
        jugadoresArgentina[0][1] = "Delantero";

        jugadoresArgentina[1][0] = "Sergio Agüero";
        jugadoresArgentina[1][1] = "Delantero";

        jugadoresArgentina[2][0] = "Paulo Dybala";
        jugadoresArgentina[2][1] = "Delantero";

        jugadoresArgentina[3][0] = "Angel Di Maria";
        jugadoresArgentina[3][1] = "Delantero";

        jugadoresArgentina[4][0] = "Gonzalo Higuaín";
        jugadoresArgentina[5][0] = "Nicolas Otamendi";

        jugadoresArgentina[6][0] = "Marcos Rojo";
        jugadoresArgentina[7][0] = "Leandro Paredes";
        jugadoresArgentina[8][0] = "Lucas Ocampos";
        jugadoresArgentina[9][0] = "Nicolás Tagliafico";
        jugadoresArgentina[9][1] = JOptionPane.showInputDialog("por favor ingrese la posición de: " + jugadoresArgentina[9][0]);

        return jugadoresArgentina;
    }
    public static void main(String[] args) {
        Season faseGrupoMundial = new Season();
        Team argentina = new Team("Argentina", 4, 3);
        Team francia = new Team("Francia", 0, 0);

        faseGrupoMundial.addTeam(argentina);
        faseGrupoMundial.addTeam(francia);

        String[][] jugadoresArgentina = generateArgPlayer();

        for (int i = 0; i < jugadoresArgentina.length; i++) {
            new Player(jugadoresArgentina[i][0], i + 1, jugadoresArgentina[i][1], argentina);
        }

        argentina.showPlayersList();

        Match finalMatch = new Match(argentina, francia);

        finalMatch.incrementLocalGoals();
        finalMatch.incrementVisitantGoals();
        finalMatch.incrementLocalGoals();




    }
}