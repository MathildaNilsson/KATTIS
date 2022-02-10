import java.util.ArrayList;
import java.util.Scanner;

public class BirthdayMemorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listOfNames = new ArrayList<>();
        ArrayList<Integer> listOfPrioNumbers = new ArrayList<>();
        ArrayList<String> listOfBdays = new ArrayList<>();
        int numberOfFriends = Integer.parseInt(scanner.nextLine());
        for(int i = 1; i <= numberOfFriends; i++){
            String friend = scanner.next();
            listOfNames.add(friend);
            int prioNumber = Integer.parseInt(scanner.next());
            listOfPrioNumbers.add(prioNumber);
            String birthday = scanner.next();
            listOfBdays.add(birthday);
        }

    }
}
