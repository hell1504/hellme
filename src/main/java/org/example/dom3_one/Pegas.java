package org.example.dom3_one;

class Pegas extends Horse {
    private double wingSpan;

    public Pegas(String color, int age, double wingSpan) {
        super(color, age);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public void run(boolean flying) {
        if (flying) {
            int flyingSpeed = 50 * 3;
            System.out.println("Пегас летит со скоростью: " + flyingSpeed + " км/ч");
        } else {
            System.out.println("Пегас бежит по земле, используя свои крылья");
        }
    }
}
