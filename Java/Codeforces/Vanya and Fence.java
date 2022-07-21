import java.util.Scanner;

public class solution {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int h = inp.nextInt();
        int count = 0, store = 0;

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = inp.nextInt();

            if (a[i] > h) {
                count++;
            }
        }
        store = ((n - count) * 1) + (count * 2);
        System.out.println(store);
        
    }
}