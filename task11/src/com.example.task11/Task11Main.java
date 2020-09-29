package com.example.task11;

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
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (arr == null || arr.length == 0) return;
        int min = 2147483647;
        int num = 0;
        for (int i = 0; i < arr.length; ++i){
            if (arr[i] <= min) {
                min = arr[i];
                num = i;
            }
        }
        arr[num] = arr[0];
        arr[0] = min;
    }

}