import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbersList = new ArrayList<>();
        int cases = scan.nextInt();
        for(int i = 0; i < cases;i++){
            int number = scan.nextInt();
            numbersList.add(number);
        }
        Collections.reverse(numbersList);
        for(int num : numbersList){
            System.out.println(num);
        }

    }
}
