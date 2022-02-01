import java.util.ArrayList;
import java.util.Scanner;

public class SpellingBee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        ArrayList<String> rightWords = new ArrayList<>();
        if (word.length() == 7 && word.matches("^[a-zA-Z]*$")) {
            String centerLetter = word.substring(0, 1);
            int dictionarySize = scanner.nextInt();
            if (dictionarySize >= 1 && dictionarySize <= 102305){
                for (int i = 0; i <= dictionarySize; i++) {
                    boolean correctWord = false;
                    String testWord = scanner.nextLine();
                    if (testWord.length() < 25 && testWord.length() > 0) {
                        if(testWord.contains(centerLetter)){
                            if(testWord.length() > 3 && testWord.matches("^[a-zA-Z]*$")){
                                for(String letter : testWord.split("")){
                                    if(word.contains(letter)){
                                        correctWord = true;
                                    }else{
                                        correctWord = false;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    if(correctWord){
                        rightWords.add(testWord);
                    }
                }
            }
        }
        for (String rightWord : rightWords) {
            System.out.println(rightWord);
        }
    }
}
