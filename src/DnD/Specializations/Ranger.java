package DnD.Specializations;

import DnD.Spec;

public class Ranger extends Spec {
    private String specName; //Ranger
    private String desc; //A warrior who uses martial prowess and nature magic to combat threats on the edges of civilization
    private String hitDie; //d10
    private String primaryStat; //Dexterity & Wisdom
    private String savingThrow; //Strength & Dexterity
    private String armor; // Light and medium armor, shields
    private String weapon; //simple and martial weapons

    public Ranger(String specName, String desc, String hitDie, String primaryStat, String savingThrow, String armor, String weapon) {
        super(specName, desc, hitDie, primaryStat, savingThrow, armor, weapon);
    }
}
