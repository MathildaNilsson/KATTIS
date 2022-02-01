import java.util.Scanner;

public class DigitSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        if(number.matches("^[0-9]+$")){
            if(number.length() == 2){
                String str1 = number.substring(1);
                String str2 = number.substring(0,1);
                System.out.println(str1 + str2);
            }
        }
    }
}
