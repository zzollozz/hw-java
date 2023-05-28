package OOP_java.lesson6.dip;

public class VariationPrint {
    public static void print1(Report report){
        PrintReport.output(report.getItems());
    }
    public static void print2(Report report){
        PrintReport2.printAll(report.getItems());
    }
    public static void print3(Report report){
        PrintReport3.saveToFile(report.getItems());
    }
}
