package com.example.task10;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class Task10Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
         */
    }

    static int numMin(int[] arr) {
        int min = arr[0];
        int res = 0;
        for(int index = 0; index < arr.length; ++index){
            if(arr[index] <= min){
                min = arr[index];
                res = index;
            }
        }
        return res;
    }

}