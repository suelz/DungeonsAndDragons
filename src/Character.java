public class Character {

    private String name;
    private int xp;
    private int level;
    private int proficiency;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    //private Race race;
    //private Class class <----- need better name


    public Character(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public Character(String name,  int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        this.name = name;
        this.xp = 0;
        this.level = 1;
        this.proficiency = 2;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void levelUp(){
        if(this.level == 20){
            return;
        }
        this.level++;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void rewardXP(int reward){
        this.xp += reward;
    }

    public void xpHelper(int n){
        if(this.xp >= n) {
            levelUp();
            this.xp -= n;
        }
    }

    public void checkXP(){
        if(this.level == 20)
            return;
        switch (this.level){
            case 1:
                xpHelper(300);
                break;
            case 2:
                xpHelper(900);
                break;
            case 3:
                xpHelper(2700);
                break;
            case 4:
                xpHelper(6500);
                break;
            case 5:
                xpHelper(14000);
                break;
            case 6:
                xpHelper(23000);
                break;
            case 7:
                xpHelper(34000);
                break;
            case 8:
                xpHelper(48000);
                break;
            case 9:
                xpHelper(64000);
                break;
            case 10:
                xpHelper(85000);
                break;
            case 11:
                xpHelper(100000);
                break;
            case 12:
                xpHelper(120000);
                break;
            case 13:
                xpHelper(140000);
                break;
            case 14:
                xpHelper(165000);
                break;
            case 15:
                xpHelper(195000);
                break;
            case 16:
                xpHelper(225000);
                break;
            case 17:
                xpHelper(265000);
                break;
            case 18:
                xpHelper(305000);
                break;
            case 19:
                xpHelper(355000);
                break;
        }
    }

    public int getProficiency() {
        return proficiency;
    }

    public void setProficiency(int proficiency) {
        this.proficiency = proficiency;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }
}
