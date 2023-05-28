package OOP_java.lesson6.src2;

public class Program {

    //TODO: (Домашняя работа: 1) Сохранить заказ в XML документ
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Order("", "", 0, 0);
        order.inputFromConsole();
        SaveIn.saveToJson(order);
        SaveIn.saveToXml(order);
        SaveMultiply.saveIn(order,"xml");
    }

}
