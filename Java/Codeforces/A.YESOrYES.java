import java.util.Scanner;

public class YesOrYes {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while (t-- > 0) {
            String s = inp.next();
            if ((s.charAt(0) == 'Y' || s.charAt(0) == 'y') &&
                    (s.charAt(1) == 'E' || s.charAt(1) == 'e') &&
                    (s.charAt(2) == 'S' || s.charAt(2) == 's')) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}