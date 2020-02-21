package org.wcci;

public class PatientTwo extends Patient {

    private String illness;


    public PatientTwo(String name, int bloodLevel, String illness) {
        super(name, bloodLevel);
    }
    public int getBloodLevel() {
        return super.getBloodLevel();
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    @Override
    public String toString() {
        return "PatientTwo{" +
                "illness='" + illness + '\'' +
                '}';


    }
}
