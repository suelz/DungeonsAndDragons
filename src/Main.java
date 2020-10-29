public class Main {

    public static void main(String[] args) {

        //Character(String name, int level, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma)
        Character conor = new Character("Conor",1);
      // public Character(String name,  int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma)
        Character bob = new Character("bob", Dice.statRoll(), Dice.statRoll(), Dice.statRoll(), Dice.statRoll(), Dice.statRoll(),Dice.statRoll());
        System.out.println("name: "+ bob.getName());
        System.out.println("level: " + bob.getLevel());
        System.out.println("Proficiency: " + bob.getProficiency());
        System.out.println("str: " + bob.getStrength());
        System.out.println("dex: " + bob.getDexterity());
        System.out.println("cons: " + bob.getConstitution());
        System.out.println("int: " + bob.getIntelligence());
        System.out.println("wis: " + bob.getWisdom());
        System.out.println("char: " + bob.getCharisma());



       /* for(int i = 0; i < 1000; i++){
            System.out.println(i + " :: " + Dice.dice(100));
        }*/

    }
}
