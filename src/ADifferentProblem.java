import java.util.Scanner;

public class ADifferentProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean notNegative = true;
        while(notNegative){
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            if(a > -1 && b >-1){
                if(a - b < 0){
                    System.out.println(b - a);
                }else{
                    System.out.println(a - b);
                }
            }else{
                notNegative = false;
            }
        }
    }
}
