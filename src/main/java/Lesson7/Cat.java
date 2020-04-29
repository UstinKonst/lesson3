package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;


    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate a) {
        System.out.println("Кот " + name + " ест");
        a.decreaseFood(appetite);
    }

    public void satiety(Plate a) {
        if (a.hungry == 1) {
            satiety = true;
            System.out.println("Кот " + name + " сыт: " + satiety);
        } else {
            satiety = false;
            System.out.println("Кот " + name + " голоден: " + satiety);
        }
    }
}
