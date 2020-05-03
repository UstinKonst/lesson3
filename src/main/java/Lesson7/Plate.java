package Lesson7;

public class Plate {
    private int food;
    public int hungry = 0;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int appetite) {
        if (appetite > food) {
            System.out.println("недостаточно еды в миске");
            hungry = 0;
        } else {
            food -= appetite;
            hungry = 1;
        }
    }

    public void info() {
        System.out.println("Количество еды в тарелке: " + food);
    }

    public void newFood(int a) {
        food += a;
    }
}
