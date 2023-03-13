import java.util.Scanner;

public class XeniaAndRingroad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int arr[] = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = input.nextInt();
        }

        long count = arr[0] - 1;
        for (int i = 0; i < m - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                count += n - arr[i] + arr[i + 1];
            } else {
                count += arr[i + 1] - arr[i];
            }
        }
        System.out.println(count);
    }
}