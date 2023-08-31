import house.Cat;

class SilentCat extends Cat {
    public String jump() {
        if(getEnergy() >= 10) return "Tired";
        setEnergy(getEnergy() + 1);
        return "....";
    }
}

class WildCat extends Cat {
    public String jump() {
        if(getEnergy() >= 10) return "Tired";
        setEnergy(getEnergy() + 5);
        return "rrrrrr";
    }
}

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