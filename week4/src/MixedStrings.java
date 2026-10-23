import java.util.Scanner;

public class MixedStrings {
    static String mix(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            if (w.length() > 1) {
                sb.append(w.charAt(w.length() - 1))
                        .append(w, 1, w.length() - 1)
                        .append(w.charAt(0));
            } else {
                sb.append(w);
            }
            if (i < words.length - 1) sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sentence: ");
        System.out.println(mix(sc.nextLine()));
    }
}