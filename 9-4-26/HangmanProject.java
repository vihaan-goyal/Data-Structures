import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class HangmanProject {
    static void main() {
        File words = new File("9-4-26/words");
        String targetWord = "";
        try{
            Scanner fileScanner = new Scanner(words);
            int randIndex = (int) (Math.random() * 850 + 1);
            for (int i = 0; i < randIndex-1; i++)
                fileScanner.nextLine();
            targetWord = fileScanner.nextLine();
        } catch (Exception e) {
            System.out.println("File not found");
            throw new RuntimeException(e);
        }
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> wrongLetters = new ArrayList<>();
        int guess = 0;
        StringBuilder currGuess = new StringBuilder("_".repeat(targetWord.length()));

        while(guess < 7){
            System.out.println("Guess a letter: ");
            char currLetter = scanner.nextLine().charAt(0);
            for (int i = 0; i < targetWord.length(); i++) {
                if (targetWord.charAt(i) == currLetter) {
                    currGuess.setCharAt(i, currLetter);
                }
                if(targetWord.indexOf(currLetter) == -1){
                    wrongLetters.add(String.valueOf(currLetter));
                    guess++;
                    break;
                }
            }
            System.out.println(currGuess);
            if(currGuess.toString().equals(targetWord)){
                System.out.println("You win!");
                return;
            }
            System.out.println("Guessed Letters: " + wrongLetters);
        }
        System.out.printf("You lost! The word was: %s\n", targetWord);
        scanner.close();
    }
}
