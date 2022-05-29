import java.util.ArrayList;
import java.util.Scanner;

public class CostumeContest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int colleagues = Integer.parseInt(scanner.nextLine());
        ArrayList<String> listOfCostumes = new ArrayList<>();
        ArrayList<String> check = new ArrayList<>();
        for (int i = 0; i < colleagues; i++){
            String costume = scanner.nextLine();
            if(!listOfCostumes.contains(costume)){
                listOfCostumes.add(costume);
                check.add(costume);
            }else{
                int alreadyIn = listOfCostumes.indexOf(costume);
                listOfCostumes.remove(alreadyIn);
            }
        }
        listOfCostumes.forEach(System.out::println);
    }
}
