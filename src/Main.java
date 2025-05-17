import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Home work if 2.");
        System.out.println("Задача 1. ");
        byte clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите веррию приложения для Android по ссылке");
        } else {  System.out.println("Установите веррию приложения для iOS по ссылке");
        }
        System.out.println("Задача 2. ");
        System.out.println("Введите год выпуска телефона: ");
        int clientDeviceYear = in.nextInt();
        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную веррию приложения для Android по ссылке");
        } else {
                System.out.println("Установите веррию приложения для Android по ссылке");
        }
        } else {
             if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную веррию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите веррию приложения для iOS по ссылке");
            }
        }
        System.out.println("Задача 3. Определение високосного года");
        System.out.println("Введите год: ");
        int Year = in.nextInt();
        if (Year % 4 == 0) {
            if ((Year % 100 == 0 && Year % 400 == 0) || (Year % 100 != 0)) {
                System.out.println("Год " + Year + " является високосным");
            } else {
                System.out.println("Год " + Year +" не является високосным");
            }
        } else {
            System.out.println("Год " + Year +" не является високосным");
        }
        System.out.println("Задача 4. Введите расстояние до вашего дома: ");
        System.out.println("Введите год: ");
        int deliveryDistance = in.nextInt();
        if (deliveryDistance < 60) {
            if (deliveryDistance < 20) {
                System.out.println("Доставка займет 1 день.");
            } else {
                System.out.println("Доставка займет 2 дня.");
            }
        } else {
            if (deliveryDistance > 100) {
                System.out.println("К сожаленю, доставки до Вас нет.");
            } else {
                System.out.println("Доставка займет 3 дня.");
            }
        }
        System.out.println("Задача 5. Введите номер месяца года: ");
        int monthYear = in.nextInt();
        switch (monthYear) {
            case 1:
            case 2:
            case 12:
                System.out.println("Месяц " + monthYear +" принадлежит к сезону зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц " + monthYear +" принадлежит к сезону весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц " + monthYear +" принадлежит к сезону лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц " + monthYear +" принадлежит к сезону осень.");
                break;
            default:
                System.out.println("Месяця " + monthYear +" не существует.");
        }

    }
}