package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int min = arr[0];
        int indMin = 0;
        for(int index = 0; index < arr.length; ++index){
            if(arr[index] < min){
                min = arr[index];
                indMin = index;
            }
        }
        int tmp;
        tmp = arr[0];
        arr[0] = arr[indMin];
        arr[indMin] = tmp;
    }

}