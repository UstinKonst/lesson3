package Lesson6;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void run(int lenght) {
        if (lenght > 500 || lenght <= 0) {
            System.out.println(name + " не смог пробежать это расстояние");
        } else {
            System.out.println(name + " пробежал " + lenght + " м.");
        }
    }

    public void swim(int lenght) {
        if (lenght > 10 || lenght <= 0) {
            System.out.println(name + " не смог проплыть это расстояние");
        } else {
            System.out.println(name + " проплыл " + lenght + " м.");
        }
    }
}
