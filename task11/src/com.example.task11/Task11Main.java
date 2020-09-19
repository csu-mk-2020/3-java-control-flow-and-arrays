package com.example.task11;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void swap(int[] arr) {
        int min;
        try {
            min = Arrays.stream(arr).min().getAsInt();
        }catch (NoSuchElementException | NullPointerException exception){
            return;
        }

        int indexMin = -1;
        for (int i = 0; i < arr.length; ++i) {
            if(arr[i] == min)
                indexMin = i;
        }
        int temp = arr[0];
        arr[0] = min;
        arr[indexMin] = temp;
    }

}