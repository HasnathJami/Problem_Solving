import java.util.Scanner;

public class Cypher {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        while (t-- > 0) {
            int n = input.nextInt();
            int a[] = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
            }

            for (int i = 0; i < n; i++) {
                int kc = input.nextInt();
                String vc = input.next();
                for (int j = 0; j < kc; j++) {
                    if (vc.charAt(j) == 'D') {
                        a[i]++;
                    } else {
                        a[i]--;
                    }

                    if (a[i] == -1) {
                        a[i] = 9;
                    }

                    if (a[i] == 10) {
                        a[i] = 0;
                    }
                }
                System.out.print(a[i]);
                if (i < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}