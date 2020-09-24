package com.example.task09;

import java.util.Arrays;

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
        System.out.println(min(new int[]{5, 4, 7, 2, 8, 3, 6}));
    }

    static int min(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        int min = arr[0];
        for(int el : arr){
            if(el < min){
                min = el;
            }
        }
        return min;
    }

}