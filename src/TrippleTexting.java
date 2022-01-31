import java.util.ArrayList;
import java.util.Scanner;

public class TrippleTexting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int stringLength = s.length();
        int sentenceLength = stringLength/3;
        String firstWord = s.substring(0,sentenceLength);
        String secondWord = s.substring(sentenceLength,sentenceLength+sentenceLength);
        String thirdword = s.substring(sentenceLength+sentenceLength, sentenceLength+sentenceLength+sentenceLength);
        if(firstWord.equals(secondWord) || firstWord.equals(thirdword)){
            System.out.println(firstWord);
        }else if(secondWord.equals(thirdword)){
            System.out.println(secondWord);
        }
    }
}
