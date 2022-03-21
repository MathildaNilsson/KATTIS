import java.util.Scanner;

public class FindingAnA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int findA = s.indexOf("a");
        String newString = s.substring(findA);
        System.out.println(newString);
    }
}
