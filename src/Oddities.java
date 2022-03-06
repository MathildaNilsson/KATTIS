import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tests = s.nextInt();
        for(int i = 1; i <= tests ;i++){
            int num = s.nextInt();
            if(num % 2 == 0){
                System.out.println(num + " is even");
            }else{
                System.out.println(num + " is odd");
            }
        }
    }
}
