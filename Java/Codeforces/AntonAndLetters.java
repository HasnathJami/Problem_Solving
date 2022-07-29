import java.util.HashSet;
import java.util.Scanner;

public class AntonAndLetters {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        HashSet<Character> h = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                h.add(s.charAt(i));
            }
        }

        System.out.println(h.size());

    }
}
