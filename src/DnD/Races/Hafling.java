package DnD.Races;

import DnD.Race;

public class Hafling extends Race {
    private String lucky; //When you roll a 1 on a d20 for an attack roll, ability check, or saving throw, you can reroll the die and must use the new roll
    private String brave; //You have advantage on saving throws against being frightened
    private String halflingNimbleness; //You can move through the space of any creature that is of a size larger than yours

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
