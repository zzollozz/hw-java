package OOP_java.lesson1.src.main.java.ru.geekbrains;

public class Hocolate extends Product {

    
    private int callories;

    public int getCallories() {
        return callories;
    }

    public Hocolate(String name, double price, int callories){ // Шоколад
        super(name, price);
        this.callories = callories;
    }

    @Override
    String displayInfo() {
        //return super.displayInfo();
        return String.format("%s - %s - %f - калории: %d", brand, name, price, callories);

    }
    
}
