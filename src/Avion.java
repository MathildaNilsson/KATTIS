import java.util.ArrayList;
import java.util.Scanner;

public class Avion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> blimpNumber = new ArrayList<>();
        for(int i = 1; i <= 5 ; i++){
            String blimpRegistration = scanner.nextLine();
            if(blimpRegistration.contains("FBI")) {
                blimpNumber.add(i);
            }
        }
        if(blimpNumber.size()>0){
            for (int blimp: blimpNumber) {
                System.out.println(blimp);
            }
        }else{
            System.out.println("HE GOT AWAY!");
        }
    }
}
