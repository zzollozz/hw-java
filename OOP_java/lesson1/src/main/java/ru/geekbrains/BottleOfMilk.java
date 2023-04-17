package OOP_java.lesson1.src.main.java.ru.geekbrains;

public class BottleOfMilk extends Product {

    private int volume;
    private int fat;

    public int getVolume() {
        return volume;
    }

    public BottleOfMilk(String name, double price, int volume, int fat){
        super(name, price);
        this.volume = volume;
        this.fat = fat;
    }

    @Override
    String displayInfo() {
        //return super.displayInfo();
        return String.format("%s - %s - %f - объем: %d", brand, name, price, volume);

    }
}
