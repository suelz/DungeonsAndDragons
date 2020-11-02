package DnD.Specializations;

import DnD.Spec;

public class Paladin extends Spec {
    private String specName; //Paladin
    private String desc; //A holy warrior bound to a sacred oath
    private String hitDie; //d10
    private String primaryStat; //Strength & Charisma
    private String savingThrow; //Wisdom & Charisma
    private String armor; // All armor, shields
    private String weapon; //Simple and martial weapons

    public Paladin(String specialization, String specName, String desc, String hitDie, String primaryStat, String savingThrow, String armor, String weapon) {
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
