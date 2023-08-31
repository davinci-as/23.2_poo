package house;

public class WildCat extends Cat {
    public String jump() {
        if (getEnergy() >= 10) return "Tired";
        setEnergy(getEnergy() + 5);
        return "rrrrrr";
    }
}
