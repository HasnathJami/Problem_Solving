import java.util.Scanner;

public class Advantage {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while (t-- > 0) {
            int n = inp.nextInt();
            int arr[] = new int[n];
            int max = Integer.MIN_VALUE;
            int secondMax = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = inp.nextInt();
                if (arr[i] >= max) {
                    secondMax = max;
                    max = arr[i];
                } else if (arr[i] >= secondMax) {
                    secondMax = arr[i];
                }
            }

            for (int i = 0; i < n; i++) {
                if (arr[i] != max) {
                    arr[i] -= max;
                } else {
                    arr[i] -= secondMax;
                }
                System.out.print(arr[i]);
                if (i != n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}