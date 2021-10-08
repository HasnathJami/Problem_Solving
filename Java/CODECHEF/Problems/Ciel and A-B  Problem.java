import java.util.Scanner;

class cielAndAMinusBProblem {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int A = inp.nextInt();
        int B = inp.nextInt();

        int res = Math.abs(A - B);

        if (res % 10 == 9) {
            System.out.println(res - 1);
        } else {
            System.out.println(res + 1);
        }
    }

}
