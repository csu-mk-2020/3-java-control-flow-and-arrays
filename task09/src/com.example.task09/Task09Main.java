package com.example.task09;

import java.util.Arrays;
import java.util.OptionalInt;

public class Task09Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = new int[3];
        arr[0] = 2;
        arr[1] = -1;
        arr[2] = 3;
        System.out.println(min(arr));
         */
    }

    static int min(int[] arr) {
        int MinArr = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < MinArr) {
                MinArr = arr[i];
            }
        }
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        return MinArr;
    }

}