package DnD.Specializations;

import DnD.Spec;

public class Cleric extends Spec {
    private String specName; //Cleric
    private String desc; //A priestly champion who wields divine magic in service of a higher power
    private String hitDie; //d18
    private String primaryStat; //Wisdom
    private String savingThrow; //Wisdom & Charisma
    private String armor; // Light and medium armor, shields
    private String weapon; //simple weapons

    public Cleric(String specialization, String specName, String desc, String hitDie, String primaryStat, String savingThrow, String armor, String weapon) {
        super(specialization);
        this.specName = specName;
        this.desc = desc;
        this.hitDie = hitDie;
        this.primaryStat = primaryStat;
        this.savingThrow = savingThrow;
        this.armor = armor;
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
