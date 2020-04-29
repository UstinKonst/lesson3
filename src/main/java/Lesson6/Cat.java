package Lesson6;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public void run(int lenght) {
        if (lenght > 200 || lenght <= 0) {
            System.out.println(name + " не смог пробежать это расстояние");
        } else {
            System.out.println(name + " пробежал " + lenght + " м.");
        }
    }

    public void swim() {
        System.out.println("Коты не умеют плавать");
    }
}
