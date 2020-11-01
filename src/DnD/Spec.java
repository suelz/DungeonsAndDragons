package DnD;

//!!!!
//DND uses the world Class to describe the specialization a character can be,
//I have decided to call it Spec as Java uses Class as a keyword for defining objects

public abstract class Spec {
    private String specialization;


    public Spec(String specialization) {
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
