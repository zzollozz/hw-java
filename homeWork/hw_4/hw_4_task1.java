package homeWork.hw_4;

import java.util.LinkedList;

public class hw_4_task1 {
    public static void main(String[] args) {
        // Пусть дан LinkedList с несколькими элементами.
        // Реализуйте метод(не void), который вернет “перевернутый” список.
        LinkedList<String> originalList = new LinkedList<>();
        originalList.add("A");
        originalList.add("B");
        originalList.add("C");
        originalList.add("D");

        LinkedList<String> reversedList = reverseLinkedList(originalList);

        System.out.println("Original list: " + originalList);
        System.out.println("Reversed list: " + reversedList);
    }

    public static <T> LinkedList<T> reverseLinkedList(LinkedList<T> list) {
        LinkedList<T> reversedList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
}
