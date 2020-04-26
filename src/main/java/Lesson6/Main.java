package Lesson6;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Cat cat = new Cat("Барсик");
        Dog dog = new Dog("Шарик");

        cat.run(150);
        dog.run(400);
        cat.swim();
        dog.swim(8);
    }
}
