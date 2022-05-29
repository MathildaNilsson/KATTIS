import java.util.ArrayList;
import java.util.Scanner;

public class SimonSays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> toDoList = new ArrayList<>();
        int numberOfSayings = scanner.nextInt();
        for(int i = 0; i <= numberOfSayings; i++){
            String simonSays = scanner.nextLine();
            if(simonSays.startsWith("Simon says")){
                String toDo = simonSays.substring(10);
                toDoList.add(toDo);
            }
        }
        for(String says : toDoList){
            System.out.println(says);
        }
    }
}
