import java.util.Scanner;

public class NoDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] splitLine = s.split(" ").clone();
        for (String word : splitLine) {
            int sameWord = 0;
            for (String word2 : splitLine) {
                if (word.equals(word2)) {
                    sameWord += 1;
                }
            }
            if (sameWord > 1) {
                System.out.println("no");
                System.exit(0);
            }
        }
        System.out.println("yes");
    }
}