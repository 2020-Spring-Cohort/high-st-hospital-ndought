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

    public void haveBloodDrawn(int amount) {
        bloodLevel -= amount;
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

