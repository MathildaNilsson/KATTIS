import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fullName = scan.nextLine();
        String firstInitial = fullName.substring(0,1);
        for(int i = 0; i< fullName.length();i++){
            if(fullName.charAt(i) == '-'){
                String initials = firstInitial +  fullName.substring(i+1,i+2);
                System.out.println(initials);

            }
        }
    }
}
