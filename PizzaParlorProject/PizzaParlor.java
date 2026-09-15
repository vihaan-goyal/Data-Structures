public class PizzaParlor {
    public enum Pizzas {Plain, Veggie, Mediterranean, Greek, MeatLovers}

    static void main() {
        for (int i = 0; i < Pizzas.values().length; i++) {
            System.out.println((i+1) + ". " + Pizzas.values()[i]);
        }
    }
}
