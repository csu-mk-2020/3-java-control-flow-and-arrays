package com.example.task10;

import java.util.stream.IntStream;

public class Task10Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {7, 5,5, 9};
        System.out.println(numMin(arr));

    }

    static int numMin(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        return IntStream.range(0, arr.length).reduce((i,j)->arr[i]>=arr[j] ? j : i).getAsInt();
    }

}