package org.wcci;

public class Janitor extends Employee {

    boolean isSweeping;

    public Janitor(String name, int empId, int salary, boolean paid, boolean isSweeping) {
        super(name, empId, salary, paid);
        this.isSweeping = isSweeping;
    }




    @Override
    public String toString() {
        return "Janitor{" +
                "isSweeping=" + isSweeping +
                '}';
    }
}


