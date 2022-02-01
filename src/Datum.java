import java.time.LocalDate;
import java.util.Scanner;

public class Datum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        LocalDate localDate = LocalDate.of(1993,m,d);
        java.time.DayOfWeek day = localDate.getDayOfWeek();
        System.out.println(day);
    }
}
