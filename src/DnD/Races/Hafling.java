package DnD.Races;

import DnD.Race;

public class Hafling extends Race {
    private String lucky;
    private String brave;
    private String halflingNimbleness;

    public Hafling(String raceName, int age, int raceStatBonus, String languages, String lucky, String brave, String halflingNimbleness) {
        super(raceName, age, raceStatBonus, languages);
        this.lucky = lucky;
        this.brave = brave;
        this.halflingNimbleness = halflingNimbleness;
    }

    public String getLucky() {
        return lucky;
    }

    public void setLucky(String lucky) {
        this.lucky = lucky;
    }

    public String getBrave() {
        return brave;
    }

    public void setBrave(String brave) {
        this.brave = brave;
    }

    public String getHalflingNimbleness() {
        return halflingNimbleness;
    }

    public void setHalflingNimbleness(String halflingNimbleness) {
        this.halflingNimbleness = halflingNimbleness;
    }
}
