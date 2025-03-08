package org.example.dom3_3;

class Secretary extends IT {
    public Secretary(String name, double salary) {
        super(name, salary);
    }

    public void handleCorrespondence() {
        System.out.println(getName() + " занимается корреспонденцией");
    }

    @Override
    public void work() {
        System.out.println(getName() + " работает, как секретарь");
        handleCorrespondence();
    }

    public void attendMeeting() {
        System.out.println(getName() + " посещает совещание, проверяет ошибки компании");
    }
}
