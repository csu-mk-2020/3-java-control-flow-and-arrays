package com.example.task13;

import java.util.Arrays;
public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null)
            return null;
        if (arr.length == 0)
            return new int[]{};
        return Arrays.stream(arr).filter(x -> x <= 1000).toArray();
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
    }

}