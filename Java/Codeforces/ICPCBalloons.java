import java.util.HashMap;
import java.util.Scanner;

public class AddPlusMinusSign {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while (t-- > 0) {
            HashMap<Character, Integer> hm = new HashMap<>();
            int n = inp.nextInt();
            String s = inp.next();
            int count = 0;
            for (int i = 0; i < n; i++) {
                char value = s.charAt(i);
                if (hm.containsKey(value)) {
                    hm.put(value, hm.get(value) + 1);
                } else {
                    hm.put(value, 1);
                }
            }
            for (int i = 0; i < n; i++) {
                char value = s.charAt(i);
                if (hm.containsKey(value)) {
                    if (hm.get(value) == 1) {
                        count = count + 2;
                        hm.put(value, 0);
                    } else if (hm.get(value) > 1) {
                        count = count + hm.get(value) + 1;
                        hm.put(value, 0);
                    }
                }
            }
            System.out.println(count);
        }

    }
}
