package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int[] arr = null;
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        if(arr == null || arr.length == 0){
            return;
        }
        int i = 0, j = 0;
        int min = arr[0];
        int indMin = 0, tmp;
        for(i = 0; i < arr.length; ++i){
            min = arr[i];
            for(j = i; j < arr.length; ++j){
                if(arr[j] <= min){
                    min = arr[j];
                    indMin = j;
                }
            }
            tmp = arr[i];
            arr[i] = min;
            arr[indMin] = tmp;
        }
    }
}