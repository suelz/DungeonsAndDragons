import DnD.Character;
import DnD.Dice;
import DnD.Race;
import DnD.Races.Dwarf;

public class Main {

    public static void main(String[] args) {


        Race race = new Dwarf("Dwarf",120,2, "Common, Dwarfish", "Can see in dark",
                "resil","dwarven weapen training"," tools","stonecunning");
        Character conor = new Character(race);

        System.out.println(conor.getRace().getLanguages());



       /* for(int i = 0; i < 1000; i++){
            System.out.println(i + " :: " + DnD.Dice.dice(100));
        }*/

    }
}
