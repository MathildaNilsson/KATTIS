import java.util.Scanner;

public class JobExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        int sum = 0;
        for(int i = 0; i<cases; i++){
            int expense = scanner.nextInt();
            if(expense < 0){
                sum += Math.abs(expense);
            }
        }
        System.out.println(sum);
    }
}