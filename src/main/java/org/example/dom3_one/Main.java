package org.example.dom3_one;

public class Main {
    public static void main(String[] args) {
        Horse horse = new Horse("Каштановый", 5);
        System.out.println("Цвет лошади: " + horse.getColor());
        horse.run();

        Pegas pegas = new Pegas("Белый", 10, 4);
        System.out.println("Цвет пегаса: " + pegas.getColor());
        System.out.println("Размах крыльев пегаса: " + pegas.getWingSpan() + " м");
        pegas.run(true);
        pegas.run(false);
    }
}
