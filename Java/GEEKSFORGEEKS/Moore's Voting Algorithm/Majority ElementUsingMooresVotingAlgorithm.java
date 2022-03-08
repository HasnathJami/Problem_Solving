// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
      
        if(size==1) return a[0];
        
        int count=0;
        int index=0;
        int major=0;
        for(int i=0;i<size;i++)
        {
            if(a[i]==a[index])
            {
                count++;
            }
          
          else  
            {
                count--;
            }
            
            
            if(count==0)
            {
                index=i;
                count=1;
            }
        }
        
        
        for(int i=0;i<size;i++)
        {
            if(a[index]==a[i])
            {
                major++;
            }
        }
        
        if(major>size/2) return a[index];
        
        return -1;
        
        
    }
}