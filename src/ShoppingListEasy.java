import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ShoppingListEasy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> boughtItemList = new ArrayList<>();
        ArrayList<String> newItemList = new ArrayList<>();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for(int i = 0; i <= n; i++ ){
            String items = scanner.nextLine();
                String[] item = items.split(" ");
            boughtItemList.addAll(Arrays.asList(item));
        }

        for(String item : boughtItemList){
            int counter = 0;
            for(String check : boughtItemList ){
                if(item.equals(check)){
                    counter++;
                }
            }
            if(counter >= n){
                if(!newItemList.contains(item)){
                    newItemList.add(item);
                }

            }
        }
        Collections.sort(newItemList);
        System.out.println(newItemList.size());
        for(String h : newItemList){
            System.out.println(h);
        }
    }
}

