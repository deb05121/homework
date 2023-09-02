package mythical;

public class MythicalCreatures {
    String name;
    CreatureType type;

    public MythicalCreatures(String name, CreatureType type) {
        this.name = name;
        this.type = type;
    }

    public MythicalCreatures() {
        name = "John";
    }


    void introduce() {
        System.out.println("Hello, I am a mythical creature and my name is " + name);
    }

    @Override
    public String toString() {
        return name;
    }
}
