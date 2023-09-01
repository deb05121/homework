package mythical;

public class Fairy extends MythicalCreatures {
    int healingPower;

    public Fairy() {
        super();
    }

    public Fairy(String name, CreatureType type, int power) {
        super(name, type);
        healingPower = power;
    }

    @Override
    void introduce() {
        System.out.printf("Hello, I am a FAIRY and my name is %s.%n", name);
    }

    void heal(MythicalCreatures c) {
        System.out.printf("%s has healed %s with %d hit points!%n", name, c, healingPower);
    }
}
