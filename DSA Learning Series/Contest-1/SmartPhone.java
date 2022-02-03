import java.util.Scanner;
import java.util.Arrays;

class solution{
    
    public static void main(String[] args)
    {
        
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        
        long a[]=new long[n];
        long maxi=0;
        
        for(int i=0;i<n;i++)
        {
            a[i]=inp.nextInt();
        }
        
        Arrays.sort(a);
        
        int len=n;
        
        for(int i=0;i<n;i++)
        {
           maxi=Math.max(maxi,a[i]*len);
           len--;
        }
        
        System.out.println(maxi);
        
    }
    
    
}