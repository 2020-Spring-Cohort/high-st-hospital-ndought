package org.wcci;

public class Janitor extends Employee {

    boolean isSweeping;

    public Janitor(String name, int empId, int salary, boolean paid, boolean isSweeping) {
        super(name, empId, salary, paid);
        this.isSweeping = isSweeping;
    }
    public boolean isSweeping() {
        return isSweeping;
    }
    @Override
    public String toString() {
        return super.toString() + "Janitor{" +
                "isSweeping=" + isSweeping +
                '}';
    }
}


