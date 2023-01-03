import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        Integer[] arr = new Integer[n];
        HashMap<Integer, Integer> hm = new HashMap<>();
        int twinSum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = arr.length - 1; i >= 0; i--) {
            twinSum = twinSum + arr[i];
            hm.put(i, twinSum);
        }
        int mySum = 0;
        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            mySum += arr[i];
            position = i;
            if (hm.containsKey(i + 1) && mySum > hm.get(i + 1)) {
                break;
            }
        }
        System.out.println(position + 1);
    }
}