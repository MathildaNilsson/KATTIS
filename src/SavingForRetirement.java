import java.util.Scanner;

public class SavingForRetirement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt(), br = scanner.nextInt(), bs = scanner.nextInt();
        //b = age, br = retire at age, bs = savings every year
        int a = scanner.nextInt(), as = scanner.nextInt();
        //a = age, as= savings every year
        int bobSavings = (br - b) *  bs;

    }
}
