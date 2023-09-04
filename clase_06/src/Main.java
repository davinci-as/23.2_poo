import house.SilentCat;
import house.WildCat;

public class Main {
    public static void main(String[] args) {
        SilentCat bolaDeNieve = new SilentCat();
        WildCat miMichi = new WildCat();

        bolaDeNieve.setEnergy(1);
        bolaDeNieve.setAge(6);
        bolaDeNieve.setColor(1);
        bolaDeNieve.setName("Bola De Nieve");

        miMichi.setEnergy(1);
        miMichi.setAge(6);
        miMichi.setColor(1);
        miMichi.setName("Mi michi");

        System.out.println("Rutina de entrenamiento\n");
        for (int i = 0; i < 4; i++) {
            bolaDeNieve.jump();
            miMichi.jump();
        }

        System.out.println(miMichi.getName() + " " + miMichi.jump());
        System.out.println(bolaDeNieve.getName() + " " + bolaDeNieve.jump());
    }
}