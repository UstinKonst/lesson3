package ru.geekbrains.lesson1;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    // Задание 1
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Угадайте число от 0 до 9, у вас есть 3 попытки");
        for (;;) {
            pass();
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            int a = sc.nextInt();
            if (a == 0) {
                break;
            } else if (a == 1) {
                System.out.println("Угадайте число от 0 до 9, у вас есть 3 попытки");
            }
        }
        System.out.println("Игра окончена");
    }

    public static void pass() {
        int x = random.nextInt(10);
        for (int i = 0; i < 3 ; i++) {
            int a = sc.nextInt();
            if (a < x) {
                System.out.println("Вы не угадали, число слишком маленькое.");
            } else if (a > x) {
                System.out.println("Вы не угадали, число слишком большое.");
            } else if (a == x) {
                System.out.println("Вы угадали!");
                break;
            }
        }
    }
}
