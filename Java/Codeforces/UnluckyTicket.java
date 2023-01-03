import java.util.Arrays;
import java.util.Scanner;

public class UnluckyTicket {
    public static String sortString(String inputString) {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        String s = inp.next();
        String s2 = sortString(s.substring(0, n));
        String s3 = sortString(s.substring(n));
        int criteria1 = 0;
        int criteria2 = 0;
        if (s2.equals(s3)) {
            System.out.println("NO");
        } else {
            for (int i = 0; i < n; i++) {
                int firstValue = s2.charAt(i);
                int secondValue = s3.charAt(i);
                if (firstValue > secondValue) {
                    criteria1++;
                } else if (firstValue < secondValue) {
                    criteria2++;
                }
            }

            if (criteria1 == n || criteria2 == n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}