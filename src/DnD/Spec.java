package DnD;

//!!!!
//DND uses the world Class to describe the specialization a character can be,
//I have decided to call it Spec as Java uses Class as a keyword for defining objects

public abstract class Spec {
    private String specName;
    private String desc;
    private String hitDie;
    private String primaryStat;
    private String savingThrow;
    private String armor;
    private String weapon;

    private int hitPoints;

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


    public int getHitPoints() {
        return hitPoints;
    }


    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints + Stats.getConstitution();
    }
}
