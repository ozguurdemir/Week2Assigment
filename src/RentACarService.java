import java.util.List;
import java.util.Scanner;

public class RentACarService {
    public void RentACar(List<Car> carList, Client client){
        DayPickerService dayPicker = new DayPickerService();
        int numberOfDaysRented = dayPicker.pickDate();
        if(client instanceof Individual){
            System.out.println("Yalnızca Hatchback Kiralayabilirsiniz");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Kiralama süresi (günlük): ");
            int days = scanner.nextInt();
            if(days>30){throw new RuntimeException("Gün süresi 30'dan büyük olamaz");}
            Car selectedCar = carList.get(2);
            int sonuc = selectedCar.calculatePrice(days);
            System.out.println(sonuc);

        }
        else {
            System.out.println("Hangi Tür araba Kiralamak İstersiniz: (Suv/Sedan/Hatchback)");
            Scanner scanner = new Scanner(System.in);
            String wantedCar = scanner.nextLine();

            if (wantedCar.equalsIgnoreCase("sedan")){
                Car selectedCar = carList.get(1);
                int sonuc = selectedCar.calculatePrice(numberOfDaysRented);
                System.out.println(sonuc);

            } else if (wantedCar.equalsIgnoreCase("suv")) {
                Car selectedCar = carList.get(0);
                int sonuc = selectedCar.calculatePrice(numberOfDaysRented);
                System.out.println(sonuc);
            }
            else {
                Car selectedCar = carList.get(2);
                int sonuc = selectedCar.calculatePrice(numberOfDaysRented);
                System.out.println(sonuc);
            }

        }
    }
}
