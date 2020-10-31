package DnD;


public abstract class Race {

    private String raceName;
    private int age;
    private int raceStatBonus;
    private String languages;

    public Race(String raceName, int age, int raceStatBonus, String languages) {
        this.raceName = raceName;
        this.age = age;
        this.raceStatBonus = raceStatBonus;
        this.languages = languages;
    }

    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRaceStatBonus() {
        return raceStatBonus;
    }

    public void setRaceStatBonus(int raceStatBonus) {
        this.raceStatBonus = raceStatBonus;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }
}
