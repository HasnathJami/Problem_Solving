import java.util.ArrayList;
import java.util.Scanner;


public class FileName {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        int xCount = 0, xCountStore = 0;
        int n = inp.nextInt();
        String s = inp.next();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'x') {
                xCount++;
            } else {
                al.add(xCount);
                xCount = 0;
            }
            if (xCount >= 3 && i == n - 1) {
                al.add(xCount);
                xCount = 0;
            }
        }
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) >= 3) {
                xCountStore += (al.get(i) - 2);
            }
        }
        System.out.println(xCountStore);
    }
}