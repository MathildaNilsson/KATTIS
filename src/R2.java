import java.util.Scanner;

public class R2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r1 = scanner.nextInt();
        int s = scanner.nextInt();
        for(int i = -1000; i<2000; i++){
            int res = (r1 + i)/2;
            if(res == s){
                System.out.println(i);
                break;
            }
        }
    }
}
