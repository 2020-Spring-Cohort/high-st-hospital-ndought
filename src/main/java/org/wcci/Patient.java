package org.wcci;

public class Patient {

    private int bloodLevel = 20;
    private String name;

    public Patient(String name){
        this.name = name;
    }

    public int getBloodLevel() {

        return bloodLevel;
    }
    public void haveBloodDrawn(int amount){
        bloodLevel -= amount;
    }
}
