import java.util.Scanner;

public class AreWeOnBudget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < cases; i++) {
            int numItems = Integer.parseInt(scanner.nextLine());
            String[] budgetAmount = scanner.nextLine().split(" ");
            String[] actualCost = scanner.nextLine().split(" ");
            double totalBudgetAmount = 0;
            double totalActualCost = 0; 
            for (int j = 0; j < numItems; j++) {
                totalBudgetAmount += Double.parseDouble(budgetAmount[j]);
                totalActualCost += Double.parseDouble(actualCost[j]);
            }
            System.out.printf("%.2f\n", (totalActualCost - totalBudgetAmount) / (numItems));
        }
        scanner.close();
    }
}
