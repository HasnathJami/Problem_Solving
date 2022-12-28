import java.util.Scanner;

public class CompareTShirtSizes {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while (t-- > 0) {
            int countX = 0;
            String a = inp.next();
            String b = inp.next();
            int lastCharacterOfA = a.charAt(a.length() - 1);
            int lastCharacterOfB = b.charAt(b.length() - 1);
            if (a.equals(b)) {
                System.out.println("=");
            } else if (lastCharacterOfA < lastCharacterOfB) {
                System.out.println(">");
            } else if (lastCharacterOfA > lastCharacterOfB) {
                System.out.println("<");
            } else {
                for (int i = 0; i < a.length(); i++) {
                    countX++;
                }
                for (int i = 0; i < b.length(); i++) {
                    countX--;
                }
                if (lastCharacterOfA == 'L') {
                    if (countX > 0) {
                        System.out.println(">");
                    } else if (countX < 0) {
                        System.out.println("<");
                    }
                } else if (lastCharacterOfA == 'S') {
                    if (countX > 0) {
                        System.out.println("<");
                    } else if (countX < 0) {
                        System.out.println(">");
                    }
                }
            }


        }

    }
}