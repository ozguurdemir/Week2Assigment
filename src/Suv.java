import java.util.Scanner;

public class Suv extends Car{

    private final int CONSTANT = 200/age;

    public Suv(int bootCapacity, String color, int age, int rentPrice) {
        super(bootCapacity, color, age, rentPrice);
    }

    @Override
    public int calculatePrice(int days) {
        int price = super.calculatePrice(days);
        price += CONSTANT;
        return price;
    }
}
