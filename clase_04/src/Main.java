import house.SilentCat;
import house.WildCat;

public class Main {
    public static void main(String[] args) {
        WildCat miMichi = new WildCat();
        miMichi.setEnergy(1);
        miMichi.setAge(6);
        miMichi.setColor(1);
        System.out.println(miMichi.jump());
        System.out.println(miMichi.jump());
        System.out.println(miMichi.jump());
        System.out.println(miMichi.jump());
    }
}