/**
 * InnerAddingTheAdditives
    Got Wrong Answer!!
 */

import java.util.ArrayList;
import java.util.Scanner;

public class AddingTheAdditives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());

        ArrayList<String> printerName = new ArrayList<>();
        ArrayList<Double> density = new ArrayList<>();
        ArrayList<Double> mass = new ArrayList<>();



        for (int i = 0; i < cases; i++) {
            String[] line = scanner.nextLine().split(" ");
            int numPrinters = Integer.parseInt(line[0]);
            int numPrintJobs = Integer.parseInt(line[1]);
            for (int j = 0; j < numPrinters; j++) {
                String[] line2 = scanner.nextLine().split(" ");
                printerName.add(line2[0]);
                density.add(Double.parseDouble(line2[1]));
                mass.add(Double.parseDouble(line2[2]));
            }
            for (int j = 0; j < numPrintJobs; j++) {
                String[] line3 = scanner.nextLine().split(" ");
                int index = printerName.indexOf(line3[0]);
                int volume = Integer.parseInt(line3[1]);
                double infill = Double.parseDouble(line3[2]);
                System.out.println((int) Math.floor(mass.get(index) /(volume * infill * density.get(index))));
            }   
        }
        scanner.close();
    }
}
