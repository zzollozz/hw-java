package OOP_java.lesson6.dip;

public class Program {

    //TODO: (2 задание ) Доработать самостоятельно
    public static void main(String[] args) {
        Report report = new Report();
        report.add(new ReportItem("Waht",5));
        VariationPrint.print1(report);
    }

}