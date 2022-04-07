//package A;
import java.util.Scanner;
public class Playoff {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int t=inp.nextInt();

        while(t-->0)
        {
            int n=inp.nextInt();
            System.out.println((int)Math.pow(2,n)-1);
        }

    }
}
