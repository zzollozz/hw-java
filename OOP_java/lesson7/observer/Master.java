package OOP_java.lesson7.observer;

public class Master implements Observer {

    private String name;
    private double salary;

    public Master(String name) {
        this.name = name;
        this.salary = 20000;
    }

    @Override
    public void reciveOffer(String companyName, double salary, String nameVak) {
        if (this.salary < salary) {
            System.out.printf("Мастер: %s >>> Мне нужка эта работа (%s - %f - %s)\n", name, companyName, salary,
                    nameVak);
            this.salary = salary;
        } else {
            System.out.printf("Мастер: %s >>> Я найду работу получше (%s - %f - %s)\n", name, companyName, salary,
                    nameVak);
        }
    }
}
