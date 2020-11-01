package DnD.Races;

import DnD.Race;

public class Dwarf extends Race {
    private String darkVision; //You can see in the dark
    private String dwarvenResilience; //Advantage on saving throws against poison, and have resistance against poison damage
    private String dwarvenCombatTraining; //Proficiency with battle-axe, hand-axe, light hammer, and warhammer
    private String toolProficiency; //Gain proficiency with artisan's tools
    private String stonecunning; //Whenever you make an Intelligence check related to the origin of stonework, you are considered proficient in the History skill

    public Dwarf(String raceName, int age, int raceStatBonus, String languages, String darkVision,
                 String dwarvenResilience, String dwarvenCombatTraining, String toolProficiency, String stonecunning) {
        super(raceName, age, raceStatBonus, languages);
        this.darkVision = darkVision;
        this.dwarvenResilience = dwarvenResilience;
        this.dwarvenCombatTraining = dwarvenCombatTraining;
        this.toolProficiency = toolProficiency;
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

    public String getToolProficiency() {
        return toolProficiency;
    }

    public void setToolProficiency(String toolProficiency) {
        this.toolProficiency = toolProficiency;
    }

    public String getStonecunning() {
        return stonecunning;
    }

    public void setStonecunning(String stonecunning) {
        this.stonecunning = stonecunning;
    }
}
