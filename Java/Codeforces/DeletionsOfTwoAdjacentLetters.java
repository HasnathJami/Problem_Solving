import java.util.Scanner;

public class DeletionsOfTwoAdjacentLetters {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while (t-- > 0) {
            boolean canConvertedToC = false;
            String s = inp.next();
            char c = inp.next().charAt(0);
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    if (i % 2 == 0) {
                        canConvertedToC = true;
                        break;
                    }
                }
            }
            if (canConvertedToC) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}