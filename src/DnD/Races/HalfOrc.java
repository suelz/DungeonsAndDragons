package DnD.Races;

import DnD.Race;

public class HalfOrc extends Race {
    private String darkVision; //You can see in the dark
    private String menacing; //You gain proficiency in the Intimidation skill
    private String relentlessEndurance;//When you are reduced to 0 hit points but not killed outright, you can drop to 1 hit point instead
    private String savageAttacks; //When you score a critical hit with a melee weapon attack, you can roll one of the weapon's damage dice" +
                                 //"one additional time and add it to the extra damage of the critical hit.

    public HalfOrc(String raceName, int age, int raceStatBonus, String languages, String darkVision, String menacing, String relentlessEndurance, String savageAttacks) {
        super(raceName, age, raceStatBonus, languages);
        this.darkVision = darkVision;
        this.menacing = menacing;
        this.relentlessEndurance = relentlessEndurance;
        this.savageAttacks = savageAttacks;
    }

    public String getDarkVision() {
        return darkVision;
    }

    public void setDarkVision(String darkVision) {
        this.darkVision = darkVision;
    }

    public String getMenacing() {
        return menacing;
    }

    public void setMenacing(String menacing) {
        this.menacing = menacing;
    }

    public String getRelentlessEndurance() {
        return relentlessEndurance;
    }

    public void setRelentlessEndurance(String relentlessEndurance) {
        this.relentlessEndurance = relentlessEndurance;
    }

    public String getSavageAttacks() {
        return savageAttacks;
    }

    public void setSavageAttacks(String savageAttacks) {
        this.savageAttacks = savageAttacks;
    }
}
