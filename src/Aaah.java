import java.util.Scanner;

public class Aaah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String jon = scanner.nextLine();
        if(jon.matches("a{0,999}h")){
            String doctor = scanner.nextLine();
            if(doctor.matches("a{0,999}h")){
                if(jon.length()>= doctor.length()) {
                    System.out.println("go");
                }else{
                    System.out.println("no");
                    }
                }
            }
        }
    }

