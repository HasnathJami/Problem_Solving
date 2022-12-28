import java.util.Scanner;

public class SSeeeeiinnggDDoouubbllee {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while (t-- > 0) {
            String s = inp.next();
            String reverseString = "";
            for (int i = 0; i < s.length(); i++) {
                reverseString = s.charAt(i) + reverseString;
            }
            System.out.println(s + reverseString);
        }
    }
}
