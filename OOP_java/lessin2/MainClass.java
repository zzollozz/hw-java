package OOP_java.lessin2;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        plate.info();

        Cat cat1 = new Cat("Барсик", 25, true);
        Cat cat2 = new Cat("Морис", 15, true);
        Cat cat3 = new Cat("Рыжик", 30, true);
        Cat cat4 = new Cat("Гранит", 36, true);
        Cat cat5 = new Cat("Полосатый", 38, true);

        Cat[] cats = new Cat[] { cat1, cat2, cat3, cat4, cat5 };

        for (Cat cat : cats) {
            while (true) {
                if (cat.eat(cat.getAppetite(), plate.getFood()) & cat.getHunger()) {
                    plate.setFood(cat.whatLeftOnThePlate(cat.getAppetite(), plate.getFood()));
                    cat.setHunger(false);
                    System.out.printf("%s получил еду и теперь счастлив.\n", cat.getName());
                    plate.info();
                    break;
                } else {
                    System.out.printf("%s остается голодным.\n", cat.getName());
                    System.out.println("\nХочешь добавить немного еды на тарелку кэт?\n" +
                            "    нажмите 1, чтобы добавить продукты\n" +
                            "    нажмите 2, чтобы оставить все как есть");
                    Scanner sn = new Scanner(System.in);
                    int choice = sn.nextInt();
                    if (choice != 1)
                        break;
                    else {
                        System.out.println("Выведите количество добавляемых продуктов");
                        plate.FillThePlate(sn.nextInt());
                        plate.info();
                    }
                }
            }

        }

        for (Cat cat : cats) {
            if (cat.getHunger())
                System.out.printf("Похоже, тебе на самом деле не нравится %s " +
                        "'конечно %s все еще грустен и голоден.\n", cat.getName(), cat.getName());
        }

    }
}
