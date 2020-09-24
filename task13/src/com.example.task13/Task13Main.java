package com.example.task13;

import java.util.Arrays;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 1100, 7, 8};
        arr = removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static int[] removeMoreThen1000(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if(arr == null || arr.length == 0){
            return arr;
        }
        int len = 0;
        for(int el : arr){
            if(el <= 1000) {
                len++;
            }
        }
        int[] res = new int[len];
        int i = 0;
        for(int el : arr){
            if(el <= 1000){
                res[i] = el;
                ++i;
            }
        }
        return arr = res;
    }

}