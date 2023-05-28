package OOP_java.lesson7.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Company {
    private List<Vakancy> vakancies = new ArrayList<>();
    private Random random;
    private String nameCompany;
    private Publisher jobAgency;

    public Company(String nameCompany, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.jobAgency = jobAgency;
        random = new Random();
    }

    /**
     * Поиск сотрудника
     */
    public void needEmployee() {
        for (Vakancy vac : vakancies) {
            double salary = vac.getSalary() * random.nextDouble(300, 1000);
            jobAgency.sendOffer(nameCompany, salary, vac.getNameVak());
        }
    }

    public void addVakancy(Vakancy vakancy) {
        vakancies.add(vakancy);
    }

    public void removeVakancy(Vakancy vakancy) {
        vakancies.remove(vakancy);
    }
}
