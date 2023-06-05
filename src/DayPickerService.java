import java.util.Scanner;

public class DayPickerService {
    public int pickDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiralama süresi (aylık/günlük): ");
        String duration = scanner.nextLine();
        int result=0;
        if (duration.equalsIgnoreCase("aylık")) {
            System.out.println("Kaç ay kiralamak istersiniz? ");
            int months = scanner.nextInt();
            result = months*30;
        }
        else {
            System.out.println("Kaç gün kiralamak istersiniz? ");
            result = scanner.nextInt();
        }
        return result;
    }
}
