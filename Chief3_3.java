package org.example.dom3_3;

class Chief extends IT {
    public Chief(String name, double salary) {
        super(name, salary);
    }

    public void makeStrategicDecisions() {
        System.out.println(getName() + " принимает стратегические решения для компании");
    }

    @Override
    public void work() {
        System.out.println(getName() + " работает, как директор");
        makeStrategicDecisions();
    }
}
