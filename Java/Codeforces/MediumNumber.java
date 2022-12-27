import java.util.Scanner;

public class MediumNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while (t-- > 0) {
            int a = inp.nextInt();
            int b = inp.nextInt();
            int c = inp.nextInt();
            int max = Math.max(Math.max(a, b), c);
            int min = Math.min(Math.min(a, b), c);
            System.out.println((a + b + c) - (max + min));

        }
    }
}