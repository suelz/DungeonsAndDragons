package DnD.Races;

import DnD.Race;

public class HalfElf extends Race {
    private String darkVision;
    private String feyAncestry;

    public HalfElf(String raceName, int age, int raceStatBonus, String languages, String darkVision, String feyAncestry) {
        super(raceName, age, raceStatBonus, languages);
        this.darkVision = darkVision;
        this.feyAncestry = feyAncestry;
    }

    public String getDarkVision() {
        return darkVision;
    }

    public void setDarkVision(String darkVision) {
        this.darkVision = darkVision;
    }

    public String getFeyAncestry() {
        return feyAncestry;
    }

    public void setFeyAncestry(String feyAncestry) {
        this.feyAncestry = feyAncestry;
    }
}
