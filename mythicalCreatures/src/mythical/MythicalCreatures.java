package mythical;

public class MythicalCreatures {
    String name;
    CreatureType type;

    MythicalCreatures() {
        name = "John";
    }

    MythicalCreatures(String name, CreatureType type) {
        this.name = name;
        this.type = type;
    }

    void introduce() {
        System.out.println("Hello, I am a mythical creature and my name is " + name);
    }

    @Override
    public String toString() {
        return  name ;
    }
}
