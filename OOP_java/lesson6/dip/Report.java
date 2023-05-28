package OOP_java.lesson6.dip;

import java.util.ArrayList;
import java.util.List;

public class Report {

    private List<ReportItem> items;	// Отчетные данные

    // расчет отчетных данных
    public void add(ReportItem rep){
        items.add(rep);
    }
    public List<ReportItem> getItems() {
        return items;
    }

    public Report() {
        this.items = new ArrayList<ReportItem>();
    }
}
