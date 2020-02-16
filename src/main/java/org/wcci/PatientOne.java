package org.wcci;

public class PatientOne extends Patient {

    private String illness;

    public PatientOne(String name, int bloodLevel, String illness) {
        super(name, bloodLevel);

    }

    public String getIllness() {
        return illness;
    }

    @Override
    public String toString() {
        return "PatientOne{" +
                "illness='" + illness + '\'' +
                '}';
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }
}
