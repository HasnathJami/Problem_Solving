import java.util.Scanner;

public class TheNumberOfPositions {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int a = inp.nextInt();
        int b = inp.nextInt();
        if (a + b >= n) {
            System.out.println(n - a);
        } else {
            int countPetersOwnPos = 1;
            System.out.println(b + countPetersOwnPos);
        }

    }
}