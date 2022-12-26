import java.util.Scanner;


public class AplusB {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while (t-- > 0) {
            String s = inp.next();
            //int a=Integer.parseInt(String.valueOf(s.charAt(0)));
            //int b=Character.getNumericValue(s.charAt(2));
            System.out.println(s.charAt(0) - '0' + s.charAt(2) - '0');
        }

    }
}