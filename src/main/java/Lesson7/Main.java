package Lesson7;

public class Main {
    public static void main(String[] args) {
        Cat[] cat = {
                new Cat("Барсик", 5, false),
                new Cat("Мурзик", 7, false),
                new Cat("Пушок", 3, false)
        };
        Plate plate = new Plate(10);

        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
            cat[i].satiety(plate);
        }
        plate.newFood(20);
        plate.info();
    }
}
