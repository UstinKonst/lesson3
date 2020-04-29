package Lesson6;

public class  Animal {
    protected String name;

    public Animal(String name){
        this.name = name;
    }

    public void run(int lenght) {
        System.out.println(name + " пробежал " + lenght + " м.");
    }

    public void swim(int lenght) {
        System.out.println(name + " проплыл " + lenght + " м.");
    }
}
