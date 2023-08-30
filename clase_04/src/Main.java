class Cat  {
    private int age;
    private int color;

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
}

public class Main {
    public static void main(String[] args) {
        Cat miMichi = new Cat();
        miMichi.setAge(6);
        miMichi.setColor(1);
    }
}