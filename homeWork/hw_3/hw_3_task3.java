package homeWork.hw_3;

import java.util.ArrayList;
import java.util.Collections;


public class hw_3_task3 {
    public static void main(String[] args) {
        // Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(8);
        list.add(3);
        System.out.println("Исходный список" + list);
        System.out.println();
        // Находим минимальное значение
        int min = Collections.min(list);

        // Находим максимальное значение
        int max = Collections.max(list);

        // Находим среднее арифметическое значение
        double average = 0;
        if (list.size() > 0) {
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            average = (double) sum / list.size();
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Average value: " + average);

    }
}
