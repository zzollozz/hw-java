package OOP_java.lesson7.observer;

public interface Publisher {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void sendOffer(String nameCompany, double salary, String nameVak);
}
