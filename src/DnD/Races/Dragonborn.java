package DnD.Races;

import DnD.Race;

public class Dragonborn extends Race {

    private String draconicAncestry;
    private String breathWeapon;
    private String damageResistance;

    public Dragonborn(String raceName, int age, int raceStatBonus, String languages, String draconicAncestry, String breathWeapon, String damageResistance) {
        super(raceName, age, raceStatBonus, languages);
        this.draconicAncestry = draconicAncestry;
        this.breathWeapon = breathWeapon;
        this.damageResistance = damageResistance;
    }

    public String getDraconicAncestry() {
        return draconicAncestry;
    }

    public void setDraconicAncestry(String draconicAncestry) {
        this.draconicAncestry = draconicAncestry;
    }

    public String getBreathWeapon() {
        return breathWeapon;
    }

    public void setBreathWeapon(String breathWeapon) {
        this.breathWeapon = breathWeapon;
    }

    public String getDamageResistance() {
        return damageResistance;
    }

    public void setDamageResistance(String damageResistance) {
        this.damageResistance = damageResistance;
    }
}
