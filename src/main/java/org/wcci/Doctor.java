package org.wcci;

public class Doctor extends Employee {
    public Doctor(String name, int empId, int salary) {
        super(name, empId, salary);
    }

    public Doctor() {
        super("Vino", 007, 90000);
    }
}

