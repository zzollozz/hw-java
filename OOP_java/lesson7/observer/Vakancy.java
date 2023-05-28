package OOP_java.lesson7.observer;

public class Vakancy {
    private String nameVak;
    private int salary;

    public Vakancy(String nameVak, int salary) {
        this.nameVak = nameVak;
        this.salary = salary;
    }

    public String getNameVak() {
        return nameVak;
    }

    public int getSalary() {
        return salary;
    }
}
