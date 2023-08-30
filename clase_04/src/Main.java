abstract class Cat  {
    private int age;
    private int color;
    private int energy;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public abstract String jump();

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
}

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
        SilentCat miMichi = new SilentCat();
        miMichi.setEnergy(1);
        miMichi.setAge(6);
        miMichi.setColor(1);
        System.out.println(miMichi.jump());
        System.out.println(miMichi.jump());
        System.out.println(miMichi.jump());
        System.out.println(miMichi.jump());
    }
}