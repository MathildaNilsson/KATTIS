import java.util.Scanner;

public class TakeTwoStones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stones = scanner.nextInt();
        if(stones >0 && stones <10000001){
            if(stones % 2 == 0 ){
                System.out.println("Bob");
            }else{
                System.out.println("Alice");
            }
        }
    }
}
