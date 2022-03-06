import java.util.Scanner;

public class FYI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String phoneNumber = scan.nextLine();
        String firstThree = phoneNumber.substring(0,3);
        if(firstThree.equals("555")){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

    }
}
