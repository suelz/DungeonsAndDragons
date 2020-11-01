package DnD.Races;

import DnD.Race;

public class Tiefling extends Race {
    private String darkVision;//You can see in the dark
    private String hellishResistance; //You have resistance to fire damage
    private String infernalLegacy; //You know the thaumaturgy cantrip.

    public Tiefling(String raceName, int age, int raceStatBonus, String languages, String darkVision, String hellishResistance, String infernalLegacy) {
        super(raceName, age, raceStatBonus, languages);
        this.darkVision = darkVision;
        this.hellishResistance = hellishResistance;
        this.infernalLegacy = infernalLegacy;
    }

    public String getDarkVision() {
        return darkVision;
    }

    public void setDarkVision(String darkVision) {
        this.darkVision = darkVision;
    }

    public String getHellishResistance() {
        return hellishResistance;
    }

    public void setHellishResistance(String hellishResistance) {
        this.hellishResistance = hellishResistance;
    }

    public String getInfernalLegacy() {
        return infernalLegacy;
    }

    public void setInfernalLegacy(String infernalLegacy) {
        this.infernalLegacy = infernalLegacy;
    }
}
