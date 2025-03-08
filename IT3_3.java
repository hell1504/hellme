package org.example.dom3_3;

public class IT {
    private String name;
    private double salary;

    public IT(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void work() {
        System.out.println(name + " выполняет свою работу");
    }
}
