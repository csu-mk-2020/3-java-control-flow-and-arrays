package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getMax(1, 2, 3, 4));
         */
    }

    static int first_max(int a, int b){
        if(a > b) return a;
        else return b;
    }

    static int getMax(int a, int b, int c, int d) {
        return(first_max(first_max(a, b), first_max(c, d)));
    }

}