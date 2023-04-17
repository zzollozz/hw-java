package OOP_java.lesson1.src.main.java.ru.geekbrains;

public class BottleOfWater extends Product {

    private int volume;

    public int getVolume() {
        return volume;
    }

    public BottleOfWater(String name, double price, int volume){ // Бутылка с водой
        super(name, price);
        this.volume = volume;
    }

    @Override
    String displayInfo() {
        //return super.displayInfo();
        return String.format("%s - %s - %f - объем: %d", brand, name, price, volume);

    }
}
