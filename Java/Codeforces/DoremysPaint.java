import java.util.Scanner;

public class DoremysPaint {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while (t-- > 0) {
            int n = inp.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = inp.nextInt();
            }
            System.out.println(1 + " " + n);
        }
    }
}
