package com.example.task11;

import java.util.stream.IntStream;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {7, 5, 10, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {
        if (arr.length != 0) {
            //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
            int ind = IntStream.range(0, arr.length).reduce((i, j) -> arr[i] >= arr[j] ? j : i).getAsInt();
            arr[0] = arr[0] + arr[ind] - (arr[ind] = arr[0]);
        }
        return;
    }

}