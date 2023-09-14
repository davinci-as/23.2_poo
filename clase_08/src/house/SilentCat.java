package house;

public class SilentCat extends Cat {
    public String jump() {
        if (getEnergy() >= 10) return "Tired";
        setEnergy(getEnergy() + 1);
        return "....";
    }

    @Override
    public void play(int time) {

    }
}
