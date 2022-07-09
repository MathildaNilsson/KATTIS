import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        int rest = x;
        for(int i = 0; i < n; i++){
            int p = scanner.nextInt();
            int a = x - p;
            rest += a;
        }
        System.out.println(rest);
    }
}
