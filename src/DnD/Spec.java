package DnD;

//!!!!
//DND uses the world Class to describe the specialization a character can be,
//I have decided to call it Spec as Java uses Class as a keyword for defining objects

public class Spec {
    private String specName; //Barbarian
    private String desc; //A fierce warrior of primitive background who can enter a battle rage
    private String hitDie; //d12
    private String primaryStat; //Strength
    private String savingThrow; //Strength & Constitution
    private String armor; // Light and medium armor, shields
    private String weapon; //simple and martial weapons

    public Spec(String specName, String desc, String hitDie, String primaryStat, String savingThrow, String armor, String weapon) {
        this.specName = specName;
        this.desc = desc;
        this.hitDie = hitDie;
        this.primaryStat = primaryStat;
        this.savingThrow = savingThrow;
        this.armor = armor;
        this.weapon = weapon;
    }

    public Spec(String specName, String desc, String hitDie, String primaryStat, String savingThrow, String weapon) {
        this.specName = specName;
        this.desc = desc;
        this.hitDie = hitDie;
        this.primaryStat = primaryStat;
        this.savingThrow = savingThrow;
        this.weapon = weapon;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getHitDie() {
        return hitDie;
    }

    public void setHitDie(String hitDie) {
        this.hitDie = hitDie;
    }

    public String getPrimaryStat() {
        return primaryStat;
    }

    public void setPrimaryStat(String primaryStat) {
        this.primaryStat = primaryStat;
    }

    public String getSavingThrow() {
        return savingThrow;
    }

    public void setSavingThrow(String savingThrow) {
        this.savingThrow = savingThrow;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
