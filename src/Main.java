import DnD.Character;
import DnD.Dice;
import DnD.Helper;
import DnD.Race;
import DnD.Races.Dwarf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String characterName = scanner.nextLine();


        Race race = Helper.pickRace();
        Character conor = new Character(characterName,0,1,0,Dice.statRoll(),Dice.statRoll(),Dice.statRoll(),Dice.statRoll(),Dice.statRoll(),Dice.statRoll(), race );

        System.out.println("Name: " + conor.getName());
        System.out.println("Level: " + conor.getLevel());
        System.out.println("Race: " + conor.getRace().getRaceName());
        System.out.println("Age: " + conor.getRace().getAge());
        System.out.println("Stats");
        System.out.println("STR: " + conor.getStrength());
        System.out.println("CONS: " + conor.getConstitution());
        System.out.println("DEX: " + conor.getDexterity());
        System.out.println("INT: " + conor.getIntelligence());
        System.out.println("WIS: " + conor.getWisdom());
        System.out.println("CHAR: " + conor.getCharisma());



    }


}
