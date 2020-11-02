package DnD.Specializations;

import DnD.Spec;

public class Sorcerer extends Spec {
    private String specName; //Sorcerer
    private String desc; //A spellcaster who draws on inherent magic from a gift or bloodline
    private String hitDie; //d16
    private String primaryStat; //Charisma
    private String savingThrow; //Constitution & Charisma
    //private String armor; // None
    private String weapon; //Daggers, darts, slings, quarterstaff, light crossbows

    public Sorcerer(String specialization, String specName, String desc, String hitDie, String primaryStat, String savingThrow, String weapon) {
        super(specialization);
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

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
