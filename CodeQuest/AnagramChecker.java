import java.util.Scanner;

public class AnagramChecker {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < cases; i++) {
            String line = scanner.nextLine();
            String[] words = line.split("\\|");
            boolean answer = isAnagram(words);
            if(answer){
                System.out.println(line + " = ANAGRAM");
            }
            else{
                System.out.println(line + " = NOT AN ANAGRAM");
            }
        }
    }

    public static boolean isAnagram(String[] words){
        if(words[0].equals(words[1]))
            return false;
        for(int j = 0; j < words[1].length(); j++){
            if(!words[0].contains(words[1].substring(j,j+1))){
                return false;
            }
        }
        return true;
    }
}
