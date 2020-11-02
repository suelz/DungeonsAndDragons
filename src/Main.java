import DnD.*;
import DnD.Character;
import DnD.Races.Dwarf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Stats stats = Helper.generateStats();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String characterName = scanner.nextLine();


        Race race = Helper.pickRace();
        Character conor = new Character(characterName,0,1,stats, race );

        System.out.println("Name: " + conor.getName());
        System.out.println("Level: " + conor.getLevel());
        System.out.println("Race: " + conor.getRace().getRaceName());
        System.out.println("Age: " + conor.getRace().getAge());
        System.out.println("Stats");
        System.out.println("STR: " + conor.getStats().getStrength());
        System.out.println("CONS: " + conor.getStats().getConstitution());
        System.out.println("DEX: " + conor.getStats().getDexterity());
        System.out.println("INT: " + conor.getStats().getIntelligence());
        System.out.println("WIS: " + conor.getStats().getWisdom());
        System.out.println("CHAR: " + conor.getStats().getCharisma());





    }


}
