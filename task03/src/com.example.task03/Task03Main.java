package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(getNameOfWeekDays(13));

    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        String[] Days = new String[]{"такого дня недели не существует", "понедельник",
                "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        if (weekDaysNumber > 7 | weekDaysNumber < 1) {
            return Days[0];
        }
        return Days[weekDaysNumber];//todo напишите здесь свою корректную реализацию этого метода, вместо существующей
    }
}