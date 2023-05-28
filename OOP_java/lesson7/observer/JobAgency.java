package OOP_java.lesson7.observer;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Реализация рассылки сообщений
     */
    @Override
    public void sendOffer(String nameCompany, double salary, String nameVak) {
        for (Observer obs : observers) {
            obs.reciveOffer(nameCompany, salary, nameVak);
        }
    }
}
