package homeWork.hw_4;

import java.util.LinkedList;

public class hw_4_task2 {
    public static void main(String[] args) {
        // Реализуйте очередь с помощью LinkedList со следующими методами:
        // enqueue() - помещает элемент в конец очереди,
        // dequeue() - возвращает первый элемент из очереди и удаляет его,
        // first() - возвращает первый элемент из очереди, не удаляя.

        LinkedList<Integer> dq = new LinkedList<>();

        enqueue(dq, 1);
        enqueue(dq, 2);
        enqueue(dq, 3);
        enqueue(dq, 4);
        enqueue(dq, 5);
        System.out.println(dq);

        System.out.println(dequeue(dq));
        System.out.println(dq);

        System.out.println(first(dq));
        System.out.println(dq);

    }

    public static void enqueue(LinkedList<Integer> ll, int num) {
        ll.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> ll) {
        int num = ll.get(0);
        ll.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> ll) {
        int num = ll.get(0);
        return num;
    }
}
