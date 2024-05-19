public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int clientOS = 2;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Нет такого приложения");
        }
        System.out.println("Задача 2");
        int yearIssu = 2015;
        int clientOS1 = 0;
        int clientDeviceYear = 2024;
        if (clientOS1 == 0 && clientDeviceYear < yearIssu) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS1 == 0 && clientDeviceYear >= yearIssu) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear >= yearIssu) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите  версию приложения для Android по ссылке");
        }

        System.out.println("Задача 3");
        int year = 2021;
        boolean yearIsValid = year >= 1584;
        boolean yearIsLeap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        if (yearIsValid && yearIsLeap) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Невисокосный год");
        }
        System.out.println("Задача 4");
        int deliveryDistance = 100;
        int delivtryDays = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + delivtryDays);
        } else if (deliveryDistance < 60) {
            deliveryDistance++;
            System.out.println("Потребуется дней: " + delivtryDays);
        } else if (deliveryDistance <= 100) {
            delivtryDays += 2;
            System.out.println("Потребуется дней: " + delivtryDays);
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println("Задача 5");
        int monthNumber = 4;
        switch (monthNumber) {
            case 12:
                System.out.println("Зимний месяц");
                break;
            case 1:
                System.out.println("Зимний месяц");
                break;
            case 2:
                System.out.println("Зимний месяц");
                break;
            case 3:
                System.out.println("Весенний месяц");
                break;
            case 4:
                System.out.println("Весенний месяц");
                break;
            case 5:
                System.out.println("Весенний месяц");
                break;
            case 6:
                System.out.println("Летний месяц");
                break;
            case 7:
                System.out.println("Летний месяц");
                break;
            case 8:
                System.out.println("Летний месяц");
                break;
            case 9:
                System.out.println("Осенний месяц");
                break;

            case 10:
                System.out.println("Осенний месяц");
                break;
            case 11:
                System.out.println("Осенний месяц");
                break;
            default:;
                System.out.println("Невалидный месяц");


        }


    }
}
