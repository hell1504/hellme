package org.example.don3_two;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(5);
        Dog dog = new Dog(8);

        System.out.println("Кот:");
        System.out.println("Возраст кота: " + cat.getAge());
        System.out.println("Счастье кота: " + cat.getPlay());
        cat.feed();
        cat.play();
        cat.scratch();

        System.out.println("\nСобака:");
        System.out.println("Возраст собаки: " + dog.getAge());
        System.out.println("Счастье собаки: " + dog.getPlay());
        dog.feed();
        dog.play();
        dog.bark();
    }
}

