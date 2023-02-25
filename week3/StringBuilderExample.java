package week3;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Greetings, ");
        sb.append("my friend!");
        String result = sb.toString();
        System.out.println(result);

        String palindrome = "dot saw I was tod";
        sb = new StringBuilder(palindrome);
        sb.reverse(); // reverse it
        System.out.println(sb);
    }
}
