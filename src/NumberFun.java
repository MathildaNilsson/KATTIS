import java.util.Scanner;

public class NumberFun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        for (int i = 0; i < cases; i++) {
            int a = scanner.nextInt(), c = scanner.nextInt();
            double b = scanner.nextInt();
            if (a + b == c || a - b == c || a / b == c || a * b == c || b - a == c || b / a == c) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }
    }
}
