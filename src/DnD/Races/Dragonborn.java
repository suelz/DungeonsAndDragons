package DnD.Races;

import DnD.Race;

public class Dragonborn extends Race {

    private String draconicAncestry; //Choose one type of dragon from the Draconic Ancestry table. Your Breath weapon and damage resistance are determined by the dragon type.
    private String breathWeapon; //You can use your action to exhale destructive energy
    private String damageResistance; //You have resistance to the damage type associated with your Draconic Ancestry

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
