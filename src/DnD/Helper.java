package DnD;
import DnD.Races.*;
import DnD.Specializations.*;

import java.util.Scanner;


// Help Functions
public class Helper {

//Get input from user validate input then call getSpec()
public static Spec pickSpec(){
    Scanner sc = new Scanner(System.in);
    int x = 0;
    specOptions();
    do {
        x = sc.nextInt();
    }while(x > 12 || x < 1);

    return getSpec(x);
    }

//Private function that is called from pickSpec()
//Returns a Spec to be added to the Character constructor
    private static Spec getSpec(int choice){
        switch(choice){
            case 1:
                return new Barbarian("Barbarian","A fierce warrior of primitive background who can enter a battle rage",
                        "d12", "Strength", "Strength & Constitution","Light and medium armor, shields",
                        "simple and martial weapons");
            case 2:
                return new Bard("Bard","An inspiring magician whose power echoes the music of creation", "d8",
                        "Charisma", "Dexterity & Charisma", "Light armor",
                        "simple weapons, hand-crossbows, long-swords, rapiers, short-swords");
            case 3:
                return new Cleric("Cleric", "A priestly champion who wields divine magic in service of a higher power",
                        "d6","Intelligence","Wisdom & Charisma", "Light and medium armor, shields",
                        "simple weapons");
            case 4:
                return new Druid("Druid", "A priest of the Old Faith, wielding the powers of nature - moonlight and plant growth, fire, and lightning - and adopting animal forms",
                        "d8", "wisdom","Intelligence & Wisdom","Light and medium armor (nonmetal), shields (nonmetal)",
                        "clubs, daggers, darts, javelins, maces, quarterstaffs, scimitars, sickles, slings, spears");
            case 5:
                return new Fighter("Fighter", "A master of martial combat and skilled with a variety of weapons and armor","d10","Strength or Dexterity",
                        "Strength & Constitution","All armor, shields","Simple and martial weapons");
            case 6:
                return new Monk("Monk","A master of martial arts, harnessing the power of the body in pursuit of physical and spiritual perfection","d10",
                        "Strength or Dexterity", "Strength & Dexterity", "Simple swords, short-swords");
            case 7:
                return new Paladin("Paladin", "A holy warrior bound to a sacred oath", "d10", "Strength & Charisma",
                        "Wisdom & Charisma", "All armor, shields", "Simple and martial weapons");
            case 8:
                return new Ranger("Ranger","A warrior who uses martial prowess and nature magic to combat threats on the edges of civilization",
                        "d10", "Dexterity & Wisdom", "Strength & Dexterity", "Light and medium armor, shields",
                        "Simple and martial weapons");
            case 9:
                return new Rogue("Rogue", "A scoundrel who uses stealth and trickery to overcome obstacles and enemies", "d6",
                        "Dexterity", "Dexterity & Charisma", "Light armor", "Simple weapons, hand crossbows, long-swords, rapiers, short-swords");
            case 10:
                return new Sorcerer("Sorcerer", "A spellcaster who draws on inherent magic from a gift or bloodline", "d16",
                        "Charisma", "Constitution & Charisma", "Daggers, darts, slings, quarterstaff, light crossbows");
            case 11:
                return new Warlock("Warlock", "A wielder of magic that is derived from a bargain with an extraplanar entity", "d8",
                        "Charisma", "Wisdom & Charisma", "Light armor", "Simple weapons");
            case 12:
                return new Wizard("Wizard","A scholarly magic-user capable of manipulating the structures of reality", "d6",
                        "Intelligence", "Intelligence & Wisdom", "Daggers, darts, slings, quarterstaffs, light crossbows");
            default:
                return null;

        }
    }
//Gets input from user validates input then calls getRace()
    public static Race pickRace(){
        Scanner sc = new Scanner(System.in);
        int x = 0;
        raceOptions();
        do {
            x = sc.nextInt();
        }while(x > 9 || x < 1);

        return getRace(x);
    }

//Private function that is called from pickRace()
//Returns a Race to be added to the Character constructor
    private static Race getRace(int choice){

        int age = getAge();

        switch(choice) {
            case 1:
                return new Dwarf("Dwarf",age,2, "Common, Dwarfish", "You can see in the dark",
                        "Advantage on saving throws against poison, and have resistance against poison damage",
                        "Proficiency with battle-axe, hand-axe, light hammer, and warhammer","Gain proficiency with artisan's tools",
                        "Whenever you make an Intelligence check related to the origin of stonework, you are considered proficient in the History skill.");
            case 2:
                return new Elf("Elf", age, 2,"Common, Elvish","You can see in the dark",
                        "Proficient in perception","Advantage on saving throws against being charmed, and magic can't put you to sleep",
                        "You do not need sleep");
            case 3:
                return new Hafling("Halfling", age,2,"Common, Halfling",
                        "When you roll a 1 on a d20 for an attack roll, ability check, or saving throw, you can reroll the die and must use the new roll",
                        "You have advantage on saving throws against being frightened",
                        "You can move through the space of any creature that is of a size larger than yours");
            case 4:
                return new Human("Human", age, 1,"Common");
            case 5:
                return new Dragonborn("Dragonborn",age,2,"Common, Draconic",
                        "Choose one type of dragon from the Draconic Ancestry table. Your Breath weapon and damage resistance are determined by the dragon type.",
                        "You can use your action to exhale destructive energy","You have resistance to the damage type associated with your Draconic Ancestry");
            case 6:
                return new Gnome("Gnome", age, 2,"Common, Gnomish", "You can see in the dark",
                        "You have advantage on all Intelligence, Wisdom, and Charisma saving throws");
            case 7:
                return new HalfElf("Half-Elf",age,2,"Common, Elvish","You can see in the dark",
                        "You have advantage on saving throws against being charmed, and magic can't put you to sleep",
                        "You gain proficiency in two skills of your choice");
            case 8:
                return new HalfOrc("Half-Orc", age,2,"Common, Orc","You can see in the dark",
                        "You gain proficiency in the Intimidation skill",
                        "When you are reduced to 0 hit points but not killed outright, you can drop to 1 hit point instead",
                        "When you score a critical hit with a melee weapon attack, you can roll one of the weapon's damage dice" +
                                "one additional time and add it to the extra damage of the critical hit.");
            case 9:
                return new Tiefling("Tiefling",age,1,"Common, Infernal", "You can see in the dark",
                        "You have resistance to fire damage",
                        "You know the thaumaturgy cantrip.");
            default:
                return null;
        }

    }

//Displays race options to user
    private static void raceOptions(){
        System.out.println("1. Dwarf \n" +
                "2. Elf \n" +
                "3. Halfling \n" +
                "4. Human \n" +
                "5. Dragonborn \n" +
                "6. Gnome \n" +
                "7. Half-Elf \n" +
                "8. Half-Orc \n" +
                "9. Tiefling\n" +
                "Pick your race (enter num): ");
    }
//Display spec choices
    private static void specOptions(){
        System.out.println("1.Barbarian \n" +
                "2.Bard \n" +
                "3.Cleric \n" +
                "4.Druid \n" +
                "5.Fighter \n" +
                "6.Monk \n" +
                "7.Paladin \n" +
                "8.Ranger \n" +
                "9.Rogue\n" +
                "10.Sorcerer\n" +
                "11.Warlock\n" +
                "12.Wizard\n" +
                "Pick your spec (enter num): ");
    }

//Get age !---thought process can't ask for age of character until race is decided
    private static int getAge(){
        Scanner sc = new Scanner(System.in);
        int x = 0;
        System.out.println("Enter age: ");
        do {
            x = sc.nextInt();
        }while(x<1);
        return x;


    }

    public static Stats generateStats(){
        return new Stats(Dice.statRoll(),Dice.statRoll(),Dice.statRoll(),Dice.statRoll(),Dice.statRoll(),Dice.statRoll(),Dice.statRoll());
    }

//Figure out how much HP a new character should get based on const + a set value based on spec and call setHitPoints()
    public static void startingHitPoints(Spec x){
       if(x.getClass() == Barbarian.class){
           x.setHitPoints(12);
           return;
       }else if(x.getClass() == Bard.class || x.getClass() == Cleric.class ||
                x.getClass() == Druid.class || x.getClass() == Monk.class ||
                x.getClass() == Rogue.class || x.getClass() == Warlock.class){
           x.setHitPoints(8);
           return;
       }else if(x.getClass() == Fighter.class || x.getClass() == Paladin.class ||
                x.getClass() == Ranger.class){
           x.setHitPoints(10);
           return;
       }else if(x.getClass() == Sorcerer.class || x.getClass() == Wizard.class){
           x.setHitPoints(6);
           return;
       }
       return;
    }
}
