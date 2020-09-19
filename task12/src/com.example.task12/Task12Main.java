package com.example.task12;

import java.util.stream.IntStream;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {
        if (arr != null && arr.length != 0) {
            //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
            for (int i = 0; i < arr.length; ++i) {
                int ind = IntStream.range(i, arr.length).reduce((k, j) -> arr[k] > arr[j] ? j : k).getAsInt();
                arr[i] = arr[i] + arr[ind] - (arr[ind] = arr[i]);
            }
        }
    }

}