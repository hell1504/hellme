package org.example.don3_two;

class Pet {
    private int age;
    private int play;
    private boolean feed;

    public Pet(int age) {
        this.age = age;
        this.play = 50;
        this.feed = true;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPlay() {
        return play;
    }

    public void setPlay(int play) {
        this.play = play;
    }
    public boolean getFeed() {
        return feed;
    }

    public void setFeed(boolean hungry) {
        feed = hungry;
    }

    public void feed() {
        if (feed) {
            System.out.println("Питомец накормлен!");
            feed = false;
            play += 10;
            System.out.println("Счастье питомца увеличилось до " + play);
        } else {
            System.out.println("Питомец не голоден!");
        }
    }

    public void play() {
        System.out.println("Вы играете с питомцем!");
        play += 15;
        System.out.println("Счастье питомца увеличилось до " + play);
    }
}
