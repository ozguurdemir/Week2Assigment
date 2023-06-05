import java.util.Scanner;

public abstract class Car {

    public int bootCapacity;
    public String color;
    public int age;
    public int rentPrice;

    public Car(int bootCapacity, String color, int age, int rentPrice) {
        this.bootCapacity = bootCapacity;
        this.color = color;
        this.age = age;
        this.rentPrice = rentPrice;
    }

    public int calculatePrice(int days){
        int price = days*rentPrice;
        return price;
    };

    public int getBootCapacity() {
        return bootCapacity;
    }

    public void setBootCapacity(int bootCapacity) {
        this.bootCapacity = bootCapacity;
    }

    public int getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(int rentPrice) {
        this.rentPrice = rentPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
