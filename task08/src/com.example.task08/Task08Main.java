package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = new int[]{};
        //arr[0] = 0;
        //arr[1] = 0;
        //arr[2] = 0;
        //arr[3] = 0;
        System.out.println(mult(arr));

    }

    static long mult(int[] arr) {
        if (arr.length == 0 )
            return 0;
        long mult = 1;
        for (int i : arr){
            mult *= i;
        }
        return mult;
    }
}