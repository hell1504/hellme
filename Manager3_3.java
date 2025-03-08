package org.example.dom3_3;

class Manager extends IT {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    public void manageTeam() {
        System.out.println(getName() + " управляющий команды");
    }

    public void attendMeeting() {
        System.out.println(getName() + " посещает совещание");
    }

    @Override
    public void work() {
        System.out.println(getName() + " работает, как менеджер");
        manageTeam();
        attendMeeting();
    }
}
