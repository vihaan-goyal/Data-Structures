import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Apollo13 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());
        double[] answers = new double[3];
        for (int i = 0; i < cases; i++) {
            String[] line = scanner.nextLine().split(" ");

            for (int j = 0; j < line.length; j++)
                if (Double.parseDouble(line[j]) < 180)
                    answers[j] = new BigDecimal(Double.toString(Double.parseDouble(line[j]) + 180))
                            .setScale(2, RoundingMode.HALF_UP)
                            .doubleValue();
                else
                    answers[j] = new BigDecimal(Double.toString(Double.parseDouble(line[j]) - 180))
                            .setScale(2, RoundingMode.HALF_UP)
                            .doubleValue();

            for (int k = 0; k < 3; k++) {
                if (k < 2)
                    System.out.printf("%06.2f ", answers[k]);
                else
                    System.out.printf("%06.2f", answers[k]);
            }
            System.out.println();
        }
        scanner.close();
    }
}
