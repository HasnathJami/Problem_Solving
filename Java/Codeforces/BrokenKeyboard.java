import java.util.HashMap;
import java.util.Scanner;

public class BrokenKeyboard {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while (t-- > 0) {
            HashMap<Character, Integer> hm = new HashMap<>();
            boolean check = false;
            int n = inp.nextInt();
            String s = inp.next();
            for (int i = 1; i < n; i++) {
                if (i % 3 != 0) {
                    hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
                } else {
                    if (hm.get(s.charAt(i - 1)) % 2 != 0) {
                        check = true;
                        break;
                    }
                }
            }
            for (char c : hm.keySet()) {
                if (hm.get(c) % 2 != 0) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
