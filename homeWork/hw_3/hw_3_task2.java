package homeWork.hw_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class hw_3_task2 {
    public static void main(String[] args) {
        // Пусть дан произвольный список целых чисел, удалить из него чётные числа

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        System.out.println(numbers);

        // Удаление чётных чисел из списка

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}




  
