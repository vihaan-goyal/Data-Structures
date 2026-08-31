import java.util.Scanner;

public class SwitchProject{
    public static void main(String[] args) {
        System.out.println("Enter a 'Y' or 'N':");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        /*
        if (input.equals("Y")){
            System.out.println("yes");
        }
        else if (input.equals("N") ){
            System.out.println("no");
        }
        else{
            System.out.println("Input invalid.");
        }
        scanner.close();
        */
        switch(input){
            case "Y": System.out.println("Yes");
                break;
            case "N": System.out.println("No");
                break;
            case "M": System.out.println("Maybe");
                break;
            default: System.out.println("Input invalid.");
       }
        
        scanner.close();
    }
}