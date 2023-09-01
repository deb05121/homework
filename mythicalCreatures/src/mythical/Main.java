package mythical;

public class Main {
    public static void main(String[] args) {
        Dragon orangeDragon = new Dragon("Orange", CreatureType.FIRE, 25);
        Dragon redDragon = new Dragon("Red", CreatureType.FIRE, 75);
        Dragon blueDragon = new Dragon("Blue", CreatureType.WATER, 50);
        Fairy riverFairy = new Fairy("River", CreatureType.WATER,20);
        Fairy lakeFairy= new Fairy("Lake", CreatureType.WATER, 40);
        Fairy seaFairy= new Fairy("Sea", CreatureType.WATER, 60);

        MythicalCreatures John = new MythicalCreatures();

        orangeDragon.introduce();
        orangeDragon.attack(John);
        redDragon.introduce();
        redDragon.attack(John);
        blueDragon.introduce();
        blueDragon.attack(John);
        riverFairy.introduce();
        riverFairy.heal(John);
        lakeFairy.introduce();
        lakeFairy.heal(John);
        seaFairy.introduce();
        seaFairy.heal(John);
    }
}
