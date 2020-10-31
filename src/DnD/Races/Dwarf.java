package DnD.Races;

import DnD.Race;

public class Dwarf extends Race {
    private String darkVision;
    private String dwarvenResilience;
    private String dwarvenCombatTraining;
    private String toolProficieny;
    private String stonecunning;

    public Dwarf(String raceName, int age, int raceStatBonus, String languages, String darkVision, String dwarvenResilience, String dwarvenCombatTraining, String toolProficieny, String stonecunning) {
        super(raceName, age, raceStatBonus, languages);
        this.darkVision = darkVision;
        this.dwarvenResilience = dwarvenResilience;
        this.dwarvenCombatTraining = dwarvenCombatTraining;
        this.toolProficieny = toolProficieny;
        this.stonecunning = stonecunning;
    }

    public String getDarkVision() {
        return darkVision;
    }

    public void setDarkVision(String darkVision) {
        this.darkVision = darkVision;
    }

    public String getDwarvenResilience() {
        return dwarvenResilience;
    }

    public void setDwarvenResilience(String dwarvenResilience) {
        this.dwarvenResilience = dwarvenResilience;
    }

    public String getDwarvenCombatTraining() {
        return dwarvenCombatTraining;
    }

    public void setDwarvenCombatTraining(String dwarvenCombatTraining) {
        this.dwarvenCombatTraining = dwarvenCombatTraining;
    }

    public String getToolProficieny() {
        return toolProficieny;
    }

    public void setToolProficieny(String toolProficieny) {
        this.toolProficieny = toolProficieny;
    }

    public String getStonecunning() {
        return stonecunning;
    }

    public void setStonecunning(String stonecunning) {
        this.stonecunning = stonecunning;
    }
}
