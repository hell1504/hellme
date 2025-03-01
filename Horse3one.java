package org.example.dom3_one;

class Horse {
    private String color;
    private int age;

    public Horse(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void run() {
        System.out.println("Лошадь бежит со скоростью: 35 км/ч");
    }
}
