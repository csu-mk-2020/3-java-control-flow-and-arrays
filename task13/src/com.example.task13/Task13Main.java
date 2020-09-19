package com.example.task13;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 1100, 7, 8};
        System.out.println(java.util.Arrays.toString(removeMoreThen1000(arr)));

    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null) return null;
        else if (arr.length == 0) return new int[]{};
        else return Arrays.stream(arr).filter(i -> i < 1000).toArray();
    }

}