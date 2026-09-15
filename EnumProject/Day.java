
public class Day {
    public enum DayOfWeek {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

    public static void main() {
        DayOfWeek d = DayOfWeek.MONDAY;
        for (int i = 0; i < DayOfWeek.values().length; i++) {
            System.out.println(DayOfWeek.values()[i]);
        }

    }
}
