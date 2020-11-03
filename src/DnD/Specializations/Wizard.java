package DnD.Specializations;

import DnD.Spec;

public class Wizard extends Spec {
    private String specName; //Wizard
    private String desc; //A scholarly magic-user capable of manipulating the structures of reality
    private String hitDie; //d6
    private String primaryStat; //Intelligence
    private String savingThrow; //Intelligence & Wisdom
    //private String armor; // None
    private String weapon; //Daggers, darts, slings, quarterstaffs, light crossbows

    public Wizard(String specName, String desc, String hitDie, String primaryStat, String savingThrow, String weapon) {
        super(specName, desc, hitDie, primaryStat, savingThrow, weapon);
    }
}
