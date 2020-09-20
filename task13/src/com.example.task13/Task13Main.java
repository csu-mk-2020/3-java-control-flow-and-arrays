package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 1100, 7, 8};
        int[] res = removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
        System.out.println(java.util.Arrays.toString(res));

    }

    static int[] removeMoreThen1000(int[] arr) {
        int count = 0;
        if (arr == null) {
            return arr;
        }
        if (arr.length < 1) {
            return arr;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1000) {
                count++;
            }
        }
        int[] resArr = new int[arr.length - count];
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 1000) {
                resArr[count] = arr[i];
                count++;
            }
        }
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        return resArr;
    }

}