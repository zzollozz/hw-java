package OOP_java.lesson6.src2;

import java.io.FileWriter;
import java.io.IOException;

public class SaveMultiply {
    /**
     * Сохранение на указанный формат, введённый вручную
     * @param ord Передача нужного Ордера
     * @param nameFormat Название формата файла(без учёта точки)
     */
    public static void saveIn(Order ord, String nameFormat) {
        nameFormat = nameFormat.replace(".","");
        String fileName = "order."+ nameFormat;
        String clientName = ord.getClientName();
        String product = ord.getProduct();
        double qnt = ord.getQnt();
        double price = ord.getPrice();
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ clientName + "\",\n");
            writer.write("\"product\":\""+product+"\",\n");
            writer.write("\"qnt\":"+qnt+",\n");
            writer.write("\"price\":"+price+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}