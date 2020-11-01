package DnD.Races;

import DnD.Race;

public class HalfElf extends Race {
    private String darkVision; //You can see in the dark
    private String feyAncestry;//You have advantage on saving throws against being charmed, and magic can't put you to sleep
    private String skillVersatility; //You gain proficiency in two skills of your choice

    public HalfElf(String raceName, int age, int raceStatBonus, String languages, String darkVision, String feyAncestry, String skillVersatility) {
        super(raceName, age, raceStatBonus, languages);
        this.darkVision = darkVision;
        this.feyAncestry = feyAncestry;
        this.skillVersatility = skillVersatility;
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

    public String getSkillVersatility() {
        return skillVersatility;
    }

    public void setSkillVersatility(String skillVersatility) {
        this.skillVersatility = skillVersatility;
    }
}
