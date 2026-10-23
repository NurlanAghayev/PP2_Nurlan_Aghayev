import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    static boolean areAnagrams(String a, String b) {
        if (a.length() != b.length()) return false;
        char[] x = a.toLowerCase().toCharArray();
        char[] y = b.toLowerCase().toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        return Arrays.equals(x, y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First string: ");
        String a = sc.nextLine();
        System.out.println("Second string: ");
        String b = sc.nextLine();
        System.out.println(areAnagrams(a, b));
    }
}