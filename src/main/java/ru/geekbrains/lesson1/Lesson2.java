package ru.geekbrains.lesson1;

import java.util.Arrays;

public class Lesson2 {

    public static void main(String[] args) {
        //array1();
       // array2();
        //array3();
        //array4();
        array5();
    }

    // пункт 1
    public static void array1() {
        int[] arr = {1, 0, 0, 1, 1, 1, 0, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // пункт 2
    public static void array2() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 3 * i;
        }
        System.out.println(Arrays.toString(arr));
    }

    //пункт 3
    public static void array3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //пункт 4
    public static void array4() {
        // int a = 1;
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = 0;
                if (i == j || j == arr.length - 1 - i) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //пункт 5
    public static void array5() {
        int[] arr = {45, 6, 18, 3, 144, 456, 11, 500, 69, 275};
        int a = 0;
        int b = 1000000000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= a) {
                a = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= b) {
                b = arr[i];
            }
        }
        System.out.println("Максимум: " + a);
        System.out.println("Минимум: " + b);
    }
}



