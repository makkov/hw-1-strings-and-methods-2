package com.hw.maxim;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

//        String fullName = lastName + " " + firstName + " " + middleName;
//        System.out.println("ФИО сотрудника - " + fullName);

        String fullName = String.format("%s %s %s", lastName, firstName, middleName);
        String answer1 = String.format("ФИО сотрудника - %s", fullName);
        System.out.println(answer1);
        System.out.println();

        System.out.println("Задача 2");
        String fullNameInUpperCase = fullName.toUpperCase();
        String answer2 = String.format("Данные ФИО сотрудника для заполнения отчета — %s", fullNameInUpperCase);
        System.out.println(answer2);
        System.out.println();

        System.out.println("Задача 3");
        String fullNameWithE = "Иванов Семён Семёнович";
        String fullNameWithoutE = fullNameWithE.replace('ё', 'е');
        System.out.println(fullNameWithoutE);
    }
}
