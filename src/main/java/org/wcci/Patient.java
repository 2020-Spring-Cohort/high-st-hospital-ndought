package org.wcci;

public class Patient {

    private String name;
    private int bloodLevel;

    public Patient(String name, int bloodLevel) {
        this.name = name;
        this.bloodLevel = 20;
    }

    public String getName() {
        return name;
    }

    public int getBloodLevel() {
        return bloodLevel;
    }

    public void haveBloodDrawn(int amount){
        bloodLevel -= amount;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", bloodLevel=" + bloodLevel +
                '}';
    }


}

