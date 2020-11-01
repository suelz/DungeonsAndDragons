package DnD.Races;

import DnD.Race;

public class Gnome extends Race {
    private String darkVision; //You can see in the dark
    private String gnomeCunning; //You have advantage on all Intelligence, Wisdom, and Charisma saving throws

    public Gnome(String raceName, int age, int raceStatBonus, String languages, String darkVision, String gnomeCunning) {
        super(raceName, age, raceStatBonus, languages);
        this.darkVision = darkVision;
        this.gnomeCunning = gnomeCunning;
    }

    public String getDarkVision() {
        return darkVision;
    }

    public void setDarkVision(String darkVision) {
        this.darkVision = darkVision;
    }

    public String getGnomeCunning() {
        return gnomeCunning;
    }

    public void setGnomeCunning(String gnomeCunning) {
        this.gnomeCunning = gnomeCunning;
    }
}
