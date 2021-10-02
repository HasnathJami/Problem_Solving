import java.util.Scanner;

class Three {

    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();

        while (t-- > 0) {
            int a = inp.nextInt();
            int b = inp.nextInt();
            int c = inp.nextInt();
            int d = inp.nextInt();
            int sum = a + b + c;

            if (sum <= d) {
                System.out.println("1");
            } else if (a + b <= d) {
                System.out.println("2");
            } else if (b + c <= d) {
                System.out.println("2");
            } else if (a + c <= d) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }

        }

    }

}
