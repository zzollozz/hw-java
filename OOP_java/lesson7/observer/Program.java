package OOP_java.lesson7.observer;

public class Program {
    public static void main(String[] args) {
        JobAgency jobAgency = new JobAgency();
        Company gekBr = new Company("GeekBr", jobAgency);
        Company google = new Company("Google", jobAgency);
        Company ya = new Company("Yandex", jobAgency);

        gekBr.addVakancy(new Vakancy("HR", 10000));
        gekBr.addVakancy(new Vakancy("Kachalka", 1000000));
        google.addVakancy(new Vakancy("QR", 20000));
        ya.addVakancy(new Vakancy("Блокнот", 200));

        Master petrovich = new Master("Petrovich");
        Master mihalich = new Master("Trump");

        Student ivanov = new Student("Popov");
        Student sidor = new Student("Slonov");

        GigaChad livs = new GigaChad("Stiven O`konor");
        GigaChad ric = new GigaChad("Bob Todos");

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(sidor);

        jobAgency.registerObserver(petrovich);
        jobAgency.registerObserver(mihalich);

        jobAgency.registerObserver(livs);
        jobAgency.registerObserver(ric);

        for (int i = 0; i < 6; i++) {
            System.out.printf("Рассылка номер %d\n", i + 1);
            gekBr.needEmployee();
            google.needEmployee();
            ya.needEmployee();

        }

    }
}
