import java.util.HashMap;
import java.util.Scanner;

public class Increasing {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while (t-- > 0) {
            HashMap<Integer, Integer> hm = new HashMap<>();
            boolean check = false;
            int n = inp.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = inp.nextInt();
                hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
            }

            for (int value : hm.keySet()) {
                if (hm.get(value) > 1) {
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

