package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void selectionSort(int[] arr) {
        if (arr == null){
            return;
        }
        if(arr.length < 1){
            return;
        }
        for(int i = 0; i<arr.length - 1; i++ ){
            int MinArr = arr[i];
            int Number= i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < MinArr) {
                    MinArr = arr[j];
                    Number = j;
                }
            }
            int tmp = arr[i];
            arr[i] = MinArr;
            arr[Number] = tmp;
        }


        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
    }

}