package ru.geekbrains.lesson1;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import org.w3c.dom.ls.LSOutput;

public class Lesson1 {

    // пункт 2
    byte a = 100;
    short b = 20000;
    int c = 3000000;
    long d = 400000000L;
    float e = 555.555f;
    double f = 66666.66666;
    char g = '\uffff';
    boolean h = true;


    public static void main(String[] args) {

        System.out.println(calculation(1.5f, 2.2f, 3.1f, 4.0f));
        System.out.println(comparison(6, 10));
        sign(5);
        System.out.println(negativeNumber(-10));
        name("Борис");
    }

    // пункт 3
    static float calculation(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    // пункт 4
    static boolean comparison(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    // пункт 5
    static void sign(int a) {
        if(a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

    }

    // пункт 6
    static boolean negativeNumber(int a) {
        return a < 0;
    }

    //пункт 7
    static void name(String a) {
        System.out.println("Привет " + a + "!");
    }
}

