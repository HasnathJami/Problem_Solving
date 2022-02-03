import java.util.Scanner;

class ReverseNumber{
    
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);
        int t=inp.nextInt();
        
        while(t-->0)
        {
            int n=inp.nextInt();
            int result=0;
            while(n>0)
            {
                int rem=(n%10);
                result=(result*10)+rem;
                n=n/10;
            }
            
             System.out.println(result);
        }
        
        
        
       
        
        
    }
    
    
}