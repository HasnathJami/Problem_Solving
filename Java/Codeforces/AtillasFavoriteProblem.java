import java.util.Scanner;


public class AtillasFavoriteProblem {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while (t-- > 0) {
            int n = inp.nextInt();
            String a = inp.next();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                int value = a.charAt(i) - 'a';
                if (value >= max) {
                    max = value;
                }
            }
            System.out.println(max + 1);

        }

    }
}