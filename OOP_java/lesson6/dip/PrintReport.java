package OOP_java.lesson6.dip;

import java.util.List;

public class PrintReport {

    public static void output(List<ReportItem> items) {
        System.out.println("Output to printer");
        for (ReportItem item : items) {
            System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }

}
