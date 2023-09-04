package house;

public class Turtle extends Animal{
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String swim() {
        return "swimming";
    }
}
