package OOP_java.lesson7.observer;

public class GigaChad implements Observer {
    private String name;
    private double salary;

    public GigaChad(String name) {
        this.name = name;
        this.salary = 200000;
    }

    @Override
    public void reciveOffer(String companyName, double salary, String nameVak) {
        if (this.salary < salary) {
            System.out.printf("Босс: %s >>> Теперь он тут главный (%s - %f - %s)\n", name, companyName, salary,
                    nameVak);
            this.salary = salary;
        } else {
            System.out.printf("Босс: %s >>> *прошёл мимо* (%s - %f - %s)\n", name, companyName, salary, nameVak);
        }
    }
}
