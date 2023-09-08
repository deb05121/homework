package mythical;

public abstract class MythicalCreature {
    private String name;
    private CreatureType type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreatureType getType() {
        return type;
    }

    public void setType(CreatureType type) {
        this.type = type;
    }

    public MythicalCreature(String name, CreatureType type) {
        this.name = name;
        this.type = type;
    }

    public MythicalCreature() {
        name = "John";
    }


    void introduce(String name) {
        System.out.println("Hello, I am a mythical creature and my name is " + name);
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
