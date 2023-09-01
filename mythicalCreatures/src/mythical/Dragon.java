package mythical;

public class Dragon extends MythicalCreatures {
    int power;


    public Dragon() {
        super();
    }

    public Dragon(String name, CreatureType type, int power) {
        super(name, type);
        this.power = power;

    }

    @Override
    void introduce() {
        System.out.printf("Hello, I am a DRAGON and my name is %s.%n" , name);
    }

    void attack(MythicalCreatures c) {
        System.out.printf("%s has attacked %s with %d!%n", name, c, power);
    }
}
