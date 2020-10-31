package DnD.Races;

import DnD.Race;

public class Elf extends Race {
    private String darkVision;
    private String keenSenses;
    private String feyAncestry;
    private String trance;

    public Elf(String raceName, int age, int raceStatBonus, String languages, String darkVision, String keenSenses, String feyAncestry, String trance) {
        super(raceName, age, raceStatBonus, languages);
        this.darkVision = darkVision;
        this.keenSenses = keenSenses;
        this.feyAncestry = feyAncestry;
        this.trance = trance;
    }

    public String getDarkVision() {
        return darkVision;
    }

    public void setDarkVision(String darkVision) {
        this.darkVision = darkVision;
    }

    public String getKeenSenses() {
        return keenSenses;
    }

    public void setKeenSenses(String keenSenses) {
        this.keenSenses = keenSenses;
    }

    public String getFeyAncestry() {
        return feyAncestry;
    }

    public void setFeyAncestry(String feyAncestry) {
        this.feyAncestry = feyAncestry;
    }

    public String getTrance() {
        return trance;
    }

    public void setTrance(String trance) {
        this.trance = trance;
    }
}
