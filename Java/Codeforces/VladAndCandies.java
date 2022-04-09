
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class VladAndCandies {

    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int t=inp.nextInt();

        while(t-->0) {
            
            int n = inp.nextInt();
            Integer a[] = new Integer[n];
            
            
            for (int i = 0; i < n; i++)
                a[i] = inp.nextInt();

            if (a.length == 1 && a[0] == 1) {
                System.out.println("YES");
                continue;
            }

            if (a.length == 1 && a[0] > 1) {
                System.out.println("NO");
                continue;
            }
            
            
            Arrays.sort(a, Collections.reverseOrder());
            
            if(a[0]-a[1]<=1)
                System.out.println("YES");
            
            else
                System.out.println("NO");
            
        }


    }
}
