package org.wcci;

public class Janitor extends Employee {

    private boolean isSweeping;

    public boolean isSweeping() {
        return isSweeping;
    }

    public void setSweeping(boolean sweeping) {
        isSweeping = sweeping;
    }

    public Janitor(String name, int empId, int salary, boolean isSweeping) {
        super(name, empId, salary);
        this.isSweeping = true;
    }
}