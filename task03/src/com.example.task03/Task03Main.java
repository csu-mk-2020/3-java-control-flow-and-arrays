package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getNameOfWeekDays(7));
         */
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        return new String[]{"такого дня недели не существует", "понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"}[weekDaysNumber];
    }
}