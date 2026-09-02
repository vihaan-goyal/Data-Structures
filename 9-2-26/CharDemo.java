import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CharDemo {
    static void main() {

        int[] letterCount = new int[26];
        File file = new File("9-2-26/poem");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    char currChar = line.charAt(i);
                    if (Character.isLetter(currChar))
                        letterCount[currChar - 97]++;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file could not be found.");
            e.printStackTrace();
        }

        for (int i = 0; i < letterCount.length; i++) {
            System.out.println((char) (i + 65) + " = " +  letterCount[i]);
        }
    }
}
