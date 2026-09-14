import java.util.Scanner;
/*
 * @author(v goyal)
 * @version(9/13/26)
*/
public class PizzaParlor {
    public enum Pizzas {
        PLAIN, VEGGIE, MEDITERRANEAN, GREEK, MEAT_LOVERS
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Vihaan's Pizza Parlor! Here's the menu:");
        displayMenu();

        Pizzas choice = selectPizza(scanner);
        System.out.println("You have selected a " + choice + " pizza. Enjoy!");
        scanner.close();
    }

    public static void displayMenu(){
        System.out.println("+-----------------------+");
        System.out.println("| VIHAAN'S PIZZA PARLOR |");
        System.out.println("+-----------------------+");
        for (int i = 0; i < Pizzas.values().length; i++) {
            System.out.printf("| %d. %-18s |%n", i + 1, Pizzas.values()[i]);
        }
        System.out.println("+-----------------------+");
    }

    public static Pizzas selectPizza(Scanner scanner){
        int selectedPizzaIndex;
        while (true) {
            System.out.println("Select a pizza:");
            if (scanner.hasNextInt()){
                selectedPizzaIndex = scanner.nextInt();
                if (selectedPizzaIndex >= 1 && selectedPizzaIndex <= Pizzas.values().length)
                    break;
            }
            System.out.println("Please select a valid pizza.");
            scanner.nextLine();
        }
        return Pizzas.values()[selectedPizzaIndex-1];
    }
}