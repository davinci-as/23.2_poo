import estadisticas.Player;
import estadisticas.Team;

public class Main {
    public static void main(String[] args) {
        Team argentina = new Team("Argentina", 4, 3);

        Player dimaria = new Player("Angel Di Maria", 7, "Delantero", argentina);
        Player messi = new Player("Lionel Messi", 10, "Delantero", argentina);
        Player dibu = new Player("Emiliano Martinez", 1, "Arquero", argentina);

        // player -> agregar equipo
        messi
            .getTeam()    //Team
            .getPlayers() //ArrayList<Player>
            .add(messi);  //add(Player)

        dimaria
                .getTeam()    //Team
                .getPlayers() //ArrayList<Player>
                .add(dimaria);  //add(Player)

        dibu
                .getTeam()    //Team
                .getPlayers() //ArrayList<Player>
                .add(dibu);  //add(Player)



        argentina.showPlayersList();
    }
}