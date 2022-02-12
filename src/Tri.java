import java.util.ArrayList;
import java.util.Scanner;

public class Tri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i<3; i++){
            int number = scanner.nextInt();
            numbers.add(number);
        }

        if(numbers.get(0) + numbers.get(1) == numbers.get(2)){
            System.out.println(numbers.get(0) + "+" + numbers.get(1) + "=" + numbers.get(2));
        }else if(numbers.get(0) == numbers.get(1) + numbers.get(2)){
            System.out.println(numbers.get(0) + "=" + numbers.get(1) + "+" + numbers.get(2));
        }else if(numbers.get(0) - numbers.get(1) == numbers.get(2)){
            System.out.println(numbers.get(0) + "-" + numbers.get(1) + "=" + numbers.get(2));
        }else if(numbers.get(0) == numbers.get(1) - numbers.get(2)){
            System.out.println(numbers.get(0) + "=" + numbers.get(1) + "-" + numbers.get(2));
        }else if(numbers.get(0) * numbers.get(1) == numbers.get(2)){
            System.out.println(numbers.get(0) + "*" + numbers.get(1) + "=" + numbers.get(2));
        }else if(numbers.get(0) == numbers.get(1) * numbers.get(2)){
            System.out.println(numbers.get(0) + "=" + numbers.get(1) + "*" + numbers.get(2));
        }else if(numbers.get(0) / numbers.get(1) == numbers.get(2)){
            System.out.println(numbers.get(0) + "/" + numbers.get(1) + "=" + numbers.get(2));
        }else if(numbers.get(0) == numbers.get(1) / numbers.get(2)){
            System.out.println(numbers.get(0) + "=" + numbers.get(1) + "/" + numbers.get(2));
        }
    }
}
