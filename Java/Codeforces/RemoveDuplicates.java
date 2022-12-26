import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int value = inp.nextInt();
            al.add(value);
            if (hm.containsKey(value)) {
                hm.put(value, hm.get(value) + 1);
            } else {
                hm.put(value, 1);
            }
        }
        System.out.println(hm.size());

        for (int i = n - 1; i >= 0; i--) {
            if (hm.get(al.get(i)) > 1) {
                al2.add(al.get(i));
                hm.put(al.get(i), 0);
            } else if (hm.get(al.get(i)) == 1) {
                al2.add(al.get(i));
            }
        }

        for (int i = al2.size() - 1; i >= 0; i--) {
            System.out.print(al2.get(i));
            if (i > 0) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}