package OOP_java.lesson7.observer;

public class Student implements Observer {

    private String name;
    private double salary;

    public Student(String name) {
        this.name = name;
        this.salary = 5000;
    }

    @Override
    public void reciveOffer(String companyName, double salary, String nameVak) {
        if (this.salary < salary) {
            System.out.printf("Студент: %s >>> Мне нужка эта работа (%s - %f - %s)\n", name, companyName, salary,
                    nameVak);
            this.salary = salary;
        } else {
            System.out.printf("Студент: %s >>> Я найду работу получше (%s - %f - %s)\n", name, companyName, salary,
                    nameVak);
        }
    }
}
