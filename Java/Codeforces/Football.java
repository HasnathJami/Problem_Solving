import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
        int t = inp.nextInt();
        int max = Integer.MIN_VALUE;
        while (t-- > 0) {
            String s = inp.next();
            if (hm.containsKey(s)) {
                hm.put(s, hm.get(s) + 1);
            } else {
                hm.put(s, 1);
            }
            max = Math.max(max, hm.get(s));
        }

        for (Map.Entry m : hm.entrySet()) {
            if ((Integer) m.getValue() == max) {
                System.out.print(m.getKey());
            }
        }
        System.out.println();
    }
}
