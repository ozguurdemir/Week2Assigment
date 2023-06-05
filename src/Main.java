import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Araba kirala");
        Individual individual = new Individual();
        individual.id=0;
        individual.name = "Nesrin";
        individual.phoneNumber = "05123456789";
        individual.tcNo = "01234567890";
        Corporate corporate = new Corporate();
        corporate.id=1;
        corporate.name = "Ozgur";
        corporate.phoneNumber = "05987654321";
        corporate.taxNo = "16173442";
        Sedan sedan = new Sedan(420,"blue",3,300);
        Hatchback hatchback= new Hatchback(310, "grey",2,200);
        Suv suv = new Suv(600,"white", 1,600);
        RentACarService rentACarService = new RentACarService();
        List<Car> carList = new ArrayList<>();
        carList.add(suv);
        carList.add(sedan);
        carList.add(hatchback);
        rentACarService.RentACar(carList,corporate);


    }
}