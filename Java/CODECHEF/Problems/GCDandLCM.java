import java.util.Scanner;

class GCDandLCM{
    
  
    
    public static long gcd(long a,long b)
    {
        
       if(a==0) return b;
       return gcd(b%a,a);
        
    }
    
    
    public static void main(String [] args)
    {
       
       Scanner inp=new Scanner(System.in);
       int t=inp.nextInt();
       while(t-->0)
       {
           long a=inp.nextLong();
           long b=inp.nextLong();
           
           long ans=gcd(a,b);
           long lcm=(a*b)/ans;
        
           System.out.println(ans+" "+lcm);
       }
       
        
    }
    
    
    
}