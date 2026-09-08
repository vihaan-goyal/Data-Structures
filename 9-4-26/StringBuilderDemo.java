public class StringBuilderDemo {
    static void main() {
        StringBuilder sb = new StringBuilder("abcde");
        sb.append("FGH");
        sb.reverse();
        System.out.println("-->" +sb.toString() + "<--");
        System.out.println(sb.capacity());
    }
}
