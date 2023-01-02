import java.util.Scanner;

public class MatrixRotation {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while (t-- > 0) {
            boolean check = false;
            int[][] arr = new int[2][2];

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    arr[i][j] = inp.nextInt();
                }
            }

            for (int k = 0; k < 4; k++) {
                if (arr[0][0] < arr[0][1] && arr[0][0] < arr[1][0] && arr[0][1] < arr[1][1] && arr[1][0] < arr[1][1]) {
                    check = true;
                    break;
                }
                int a = arr[0][0];
                int b = arr[0][1];
                int c = arr[1][0];
                int d = arr[1][1];
                
                arr[0][0] = c;
                arr[0][1] = a;
                arr[1][0] = d;
                arr[1][1] = b;
            }

            if (check) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
