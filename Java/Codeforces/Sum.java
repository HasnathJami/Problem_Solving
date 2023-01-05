import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while (t-- > 0) {
            int max, min, mid;
            int a = inp.nextInt();
            int b = inp.nextInt();
            int c = inp.nextInt();
            max = Math.max(Math.max(a, b), c);
            min = Math.min(Math.min(a, b), c);
            mid = (a + b + c) - (max + min);
            if (max == (min + mid)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
