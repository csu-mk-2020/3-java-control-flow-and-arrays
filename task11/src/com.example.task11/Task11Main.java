package com.example.task11;

import java.lang.reflect.Array;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[]  arr = new int[]{};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {
        if (arr != null && arr.length != 0) {
        int min = arr[0];
        int buff = 0;
            for (int i = 0; i < arr.length; i++) {
                if (min >= arr[i] && i != 0) {
                    min = arr[i];
                    buff = arr[0];
                    arr[0] = arr[i];
                    arr[i] = buff;
                }
            }
        }
    }
    //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
}
