import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < cases; i++) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}