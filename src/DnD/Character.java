package DnD;

public class Character {

    private String name;
    private int xp;
    private int level;
    private Stats stats;
    private Spec spec;
    private Race race;

    public Character(String name, int xp, int level, Stats stats, Spec spec, Race race) {
        this.name = name;
        this.xp = xp;
        this.level = level;
        this.stats = stats;
        this.spec = spec;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void levelUp(){
        if(this.level == 20){
            return;
        }
        this.level++;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void rewardXP(int reward){
        this.xp += reward;
    }

    public void xpHelper(int n){
        if(this.xp >= n) {
            levelUp();
            this.xp -= n;
        }
    }

    public void checkXP(){
        if(this.level == 20)
            return;
        switch (this.level){
            case 1:
                xpHelper(300);
                break;
            case 2:
                xpHelper(900);
                break;
            case 3:
                xpHelper(2700);
                break;
            case 4:
                xpHelper(6500);
                break;
            case 5:
                xpHelper(14000);
                break;
            case 6:
                xpHelper(23000);
                break;
            case 7:
                xpHelper(34000);
                break;
            case 8:
                xpHelper(48000);
                break;
            case 9:
                xpHelper(64000);
                break;
            case 10:
                xpHelper(85000);
                break;
            case 11:
                xpHelper(100000);
                break;
            case 12:
                xpHelper(120000);
                break;
            case 13:
                xpHelper(140000);
                break;
            case 14:
                xpHelper(165000);
                break;
            case 15:
                xpHelper(195000);
                break;
            case 16:
                xpHelper(225000);
                break;
            case 17:
                xpHelper(265000);
                break;
            case 18:
                xpHelper(305000);
                break;
            case 19:
                xpHelper(355000);
                break;
        }
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public Spec getSpec() {
        return spec;
    }

    public void setSpec(Spec spec) {
        this.spec = spec;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }
}
