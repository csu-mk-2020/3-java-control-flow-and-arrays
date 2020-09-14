package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int[] arr = new int[]{9, 11, 7, 8};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int minIndex = 0;
        for(int i = 1; i < arr.length; ++i) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        int tmp = arr[0];
        arr[0] = arr[minIndex];
        arr[minIndex] = tmp;
    }

}