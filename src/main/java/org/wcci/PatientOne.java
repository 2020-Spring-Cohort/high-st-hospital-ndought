package org.wcci;

public class PatientOne extends Patient {

    private String illness;

    public PatientOne(String name, int bloodLevel, String illness) {
        super(name, bloodLevel);

    }

    @Override
    public int getBloodLevel() {
        return super.getBloodLevel();
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
