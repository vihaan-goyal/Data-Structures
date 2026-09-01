public class PrintFormat {
    public static void main(String[] args) {
        double w, x, y, z;
        x = 1.23;
        y = 4.5678;
        z = 3.0;
        w = 5.4;
        /*System.out.printf("\t\t" + "$%.2f\n", w);
        System.out.printf("\t\t" + "$%.2f\n", x);
        System.out.printf("\t\t" + "$%.2f\n", y);
        System.out.printf("\t\t" + "$%.2f\n", z);
         */
        System.out.printf("\t\t $%.2f\n \t\t $%.2f\n \t\t $%.2f\n \t\t $%.2f", w, x, y, z);

    }
}
