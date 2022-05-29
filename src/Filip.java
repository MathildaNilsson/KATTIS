
import java.util.Scanner;

public class Filip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(), reversedA = 0;
        int b = scanner.nextInt(), reversedB = 0;


        for(;a != 0; a /= 10) {
            int newA = a % 10;
            reversedA = reversedA * 10 + newA;
        }

        for(;b != 0; b /= 10) {
            int newB = b % 10;
            reversedB = reversedB * 10 + newB;
        }

        System.out.println(Math.max(reversedA, reversedB));

    }
}
