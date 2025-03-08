package org.example.dom3_3;

class Worker extends IT {
    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " работает на своем рабочем месте");
    }
}
