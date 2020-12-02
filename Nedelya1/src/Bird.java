//6
public class Bird {
    private final Wings wings;
    private final String name;
    private final Beak beak;
    private final Attack attack;
    private final Eat eat;

    public Bird(String name) {
        this.name = name;
        this.wings = new Wings();
        this.eat = new Eat();
        this.beak = new Beak();
        this.attack = new Attack();
    }

    public void fly() {
        System.out.print(name + " Летает и высматривает жертву");
        wings.use();
    }

    public void eat() {
        System.out.print(name + " Любит поесть");
        eat.use();
    }

    public void down() {
        System.out.print(name + " Любитель посидеть на всем, что видет");
        beak.use();
    }

    public void attack() {
        System.out.print(name + " Молниеносно атакует жертву");
        attack.use();
    }

}