 { Driver Code Starts
Initial Template for Java


import java.io.;
import java.util.;


class Array {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t--  0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            
            for(int i=0;in;i++){
                a[i] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            System.out.println(ob.print2largest(a,n));
        }
        
	}
} } Driver Code Ends


User function Template for Java

class Solution
{ 
    public static int print2largest(int A[],int N) 
    {
        CODE HERE
        
        if(N=1) return -1;
        
        
        int maxi1=Integer.MIN_VALUE;
        int maxi2=Integer.MIN_VALUE;
        for(int i=0;iN;i++)
        {
            if(A[i]=maxi1)
            {
                maxi1=A[i];
            }
            
            if(A[i]maxi1)
            {
                maxi2=maxi1;
                maxi1=A[i];
            }
        }
        
        for(int i=0;iN;i++)
        {
            if(A[i]=maxi2 && A[i]!=maxi1)
            {
                maxi2=A[i];
            }
        }
        
        if(maxi2==Integer.MIN_VALUE) return -1;
        
        return maxi2;
    }
}
        
