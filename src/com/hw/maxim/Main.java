package com.hw.maxim;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Задача 1");
//        String firstName = "Ivan";
//        String middleName = "Ivanovich";
//        String lastName = "Ivanov";
//
////        String fullName = lastName + " " + firstName + " " + middleName;
////        System.out.println("ФИО сотрудника - " + fullName);
//
//        String fullName = String.format("%s %s %s", lastName, firstName, middleName);
//        String answer1 = String.format("ФИО сотрудника - %s", fullName);
//        System.out.println(answer1);
//        System.out.println();
//
//        System.out.println("Задача 2");
//        String fullNameInUpperCase = fullName.toUpperCase();
//        String answer2 = String.format("Данные ФИО сотрудника для заполнения отчета — %s", fullNameInUpperCase);
//        System.out.println(answer2);
//        System.out.println();
//
//        System.out.println("Задача 3");
//        String fullNameWithE = "Иванов Семён Семёнович";
//        String fullNameWithoutE = fullNameWithE.replace('ё', 'е');
//        System.out.println(fullNameWithoutE);
//        System.out.println();


        System.out.println("Задача 1");
        int year2020 = 2020;
        printYearType(year2020);
        int year2023 = 2023;
        printYearType(year2023);
        System.out.println();

        System.out.println("Задача 2");
        int os = 0;
        printInfoMessage(os);
        System.out.println();

        System.out.println("Задача 3");
        int deliveryDistance = -2;
        printDeliveryDays(deliveryDistance);
    }

    public static void printYearType(int year) {
        if (isLeapYear(year)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public static void printInfoMessage(int os) {
        int year = LocalDate.now().getYear();
        String message = getInfoMessage(os, year);
        System.out.println(message);
    }

    public static String getInfoMessage(int os, int year) {
        if (os == 0 && year < 2015) {
            return "Установите облегченную версию приложения для iOS по ссылке";
        } else if (os == 0 && year >= 2015) {
            return "Установите версию приложения для iOS по ссылке";
        } else if (os == 1 && year < 2015) {
            return "Установите облегченную версию приложения для Android по ссылке";
        } else if (os == 1 && year >= 2015) {
            return "Установите версию приложения для Android по ссылке";
        } else {
            return "Не удалось определить версию";
        }
    }

    public static void printDeliveryDays(int deliveryDistance) {
        int deliveryDays = calculateDeliveryDays(deliveryDistance);

        String message;
        if (deliveryDays != -1) {
            message = String.format("Потребуется дней: %s", deliveryDays);
        } else {
            message = "Доставки нет";
        }

        System.out.println(message);
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance < 100) {
            return 3;
        } else {
            return -1;
        }
    }
}
