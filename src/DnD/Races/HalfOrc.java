package DnD.Races;

import DnD.Race;

public class HalfOrc extends Race {
    private String darkVision;
    private String menacing;
    private String relentlessEndurance;
    private String savageAttacks;

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
