// { Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class ThirdLargestElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n =sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Solution g = new Solution();
			System.out.println(g.thirdLargest(arr,n));
		t--;
		}
	}
}// } Driver Code Ends


class Solution
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    
	    if(n<3) return -1;
	    
	    int maxi1=Integer.MIN_VALUE;
	    int maxi2=Integer.MIN_VALUE;
	    int maxi3=Integer.MIN_VALUE;
	    
	    for(int i=0;i<n;i++)
	    {
	        if(a[i]>=maxi3)
	        {
	             maxi3=a[i];
	        }
	         
	          
	        if(a[i]>=maxi2)
	        {
	            maxi3=maxi2;
	            maxi2=a[i];
	        }
	           
	           
	           
	         if(a[i]>=maxi1)
	         {
	             maxi2=maxi1;
	             maxi1=a[i];
	         }
	          
	            
	        
	          
	          
	    }
	    
	     return maxi3; 
    }
}
