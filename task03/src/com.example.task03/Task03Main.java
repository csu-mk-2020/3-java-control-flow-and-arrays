package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getNameOfWeekDays(7));
         */
    }

    private static String[] Days = new String[]
            {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};

    static String getNameOfWeekDays(int weekDaysNumber) {
        return weekDaysNumber > 7 || weekDaysNumber < 1
                ? "такого дня недели не существует"
                : Days[weekDaysNumber - 1];
    }
}