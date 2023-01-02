import java.util.Scanner;

public class DoremysPerfectMathClass {
    public static int gcd(int x, int y) {
        int r, a, b;
        a = Math.max(x, y);
        b = Math.min(x, y);
        r = b;
        if (b == 0) {
            return a;
        }
        while (a % b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while (t-- > 0) {
            int storeGCD = 0;
            int n = inp.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = inp.nextInt();
                storeGCD = gcd(storeGCD, arr[i]);
            }
            System.out.println(arr[n - 1] / storeGCD);
        }
    }
}