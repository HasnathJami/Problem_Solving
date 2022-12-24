import java.util.Scanner;

public class ExtremelyRound {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while (t-- > 0) {
            int n = inp.nextInt();
            int digitCount = 0;
            int firstDigit = 0;
            while (n > 0) {
                firstDigit = n;
                n = n / 10;
                digitCount++;
            }
            System.out.println((digitCount - 1) * 9 + firstDigit);
        }
    }
}
