//package A;
import java.util.Scanner;
public class VasyaAndCoins {

    public static void main(String[] args) {

     Scanner inp=new Scanner(System.in);
     int t=inp.nextInt();

     while(t-->0)
     {
       int a=inp.nextInt();
       int b=inp.nextInt();

       if(a==0)
           System.out.println(1);

       else if(b==0)
           System.out.println(a+1);

       else
           System.out.println(a+(b*2)+1);


     }


    }

}
