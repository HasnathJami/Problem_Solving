import java.util.Scanner;

public class Lucky {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();

        while (t-- > 0) {
            String s = inp.next();

            if (solve(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }

    private static boolean solve(String s) {

        int first = 0, last = s.length() - 1, sum1 = 0, sum2 = 0;

        while (first <= last) {
            sum1 += Integer.parseInt(String.valueOf(s.charAt(first)));
            sum2 += Integer.parseInt(String.valueOf(s.charAt(last)));
            first++;
            last--;
        }

        return sum1 == sum2;
    }
}
