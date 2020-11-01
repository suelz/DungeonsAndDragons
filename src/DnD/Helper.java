package DnD;
import DnD.Races.*;
import java.util.Scanner;


// Help Functions
public class Helper {


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


}
