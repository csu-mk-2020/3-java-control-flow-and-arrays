package com.example.task11;

import sun.security.util.ArrayUtil;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Task11Main {
    public static void main(String[] args) {
        int[] arr = null;
        swap(arr);
    }

    static void swap(int[] arr) {
        int min;
        try {
            min = Arrays.stream(arr).min().getAsInt();
        } catch (NoSuchElementException | NullPointerException ex) {
            return;
        }

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                index = i;
            }
        }
        int tmp = arr[0];
        arr[0] = arr[index];
        arr[index] = tmp;
    }

}