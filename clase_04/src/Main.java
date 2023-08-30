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

    public String jump() {
        return "juuumping";
    }

}

class SilentCat extends Cat {
    public String jump() {
        return "....";
    }
}

public class Main {
    public static void main(String[] args) {
        SilentCat miMichi = new SilentCat();
        miMichi.setAge(6);
        miMichi.setColor(1);
        System.out.println(miMichi.jump());
    }
}