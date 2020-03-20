package org.wcci;

public class Patient {

    private String name;
    private int bloodLevel;
    private int healthLevel;

    public Patient(String name, int bloodLevel, int healthLevel) {
        this.name = name;
        this.bloodLevel = bloodLevel;
        this.healthLevel = healthLevel;
    }

    public String getName() {
        return name;
    }

    public int getBloodLevel() {
        return bloodLevel;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public int haveBloodDrawn(int amount) {
       return bloodLevel -16;
    }

    public int receiveCare(int amount) {
        return healthLevel +5;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", bloodLevel=" + bloodLevel +
                ", healthLevel=" + healthLevel +
                '}';
    }

}

