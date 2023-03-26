package homeWork.hw_1;

import java.util.Scanner;

public class hw_1 {
    public static void main(String[] args) {
        // ------------------------- Задача 1 -------------------------
        // Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n!
        // (произведение чисел от 1 до n)
        // Ввод:5
        // Треугольное число 1 + 2 + 3 + 4 + 5 = 15
        // n! 1 * 2 * 3 * 4 * 5 = 120

        System.out.println("----- Задача 1 -------");

        System.out.println("Укажите число: ");
        Scanner scaner = new Scanner(System.in);
        int number = scaner.nextInt();
        scaner.close();
        int resSum = 0;
        int resPro = 1;
        for (int i = 1; i < number + 1; i++) {
            resSum = resSum + i;
            resPro = resPro * i;
        }
        System.out.println("Сумма чисел от 1 до " + number + " = " + resSum);
        System.out.println("Произведение чисел от 1 до " + number + " = " + resPro);

        // ---------------------- Задача 2 ----------------------------
        // Вывести все простые числа от 1 до 1000
        System.out.println("----- Задача 2 -------");
        int numberPosled = 1000;
        int count = 2;

        while (count < numberPosled) {
            boolean flag = false;
            if (count == 2) {
                flag = true;
            }
            for (int i = 2; i < count; ++i) {
                if (i == (count - 1)) {
                    flag = true;
                }
                if ((count % i) == 0) {
                    break;
                }
            }
            if (flag) {
                System.out.println(count);
            }
            count++;
        }

        // ------------------- Задача 3 -------------------------------
        // Реализовать простой калькулятор (+ - / *)
        // Ввод числа ->
        // Ввод знака ->
        // Ввод числа ->
        System.out.println("----- Задача 3 -------");

        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите первое число: ");
        int numberOne = sc.nextInt();

        System.out.println("Укажите операцию: ");
        String znak = sc.next();

        System.out.println("Укажите второе число: ");
        int numberTwo = sc.nextInt();
        sc.close();

        switch (znak) {
            case "+":
                System.out.println("Ответ: " + (numberOne + numberTwo));
                break;
            case "-":
                System.out.println("Ответ: " + (numberOne - numberTwo));
                break;
            case "*":
                System.out.println("Ответ: " + (numberOne * numberTwo));
                break;
            case "/":
                System.out.println("Ответ: " + (numberOne / numberTwo));
                break;
        }
    }
}
