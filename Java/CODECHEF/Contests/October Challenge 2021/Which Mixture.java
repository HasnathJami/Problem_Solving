
import java.util.Scanner;



 class WhichMixture {
    
    public static void main(String[] args) {
        
        Scanner inp=new Scanner(System.in);
        int t;
        t=inp.nextInt();
        
        while(t-->0)
        {
           int A,B;
           A=inp.nextInt();
           B=inp.nextInt();
           
           if(A>0 && B>0)
                System.out.println("Solution");
           
           else if(B==0)
                System.out.println("Solid");
           
           else if(A==0)
                System.out.println("Liquid");
        }
        
    }
    
}
