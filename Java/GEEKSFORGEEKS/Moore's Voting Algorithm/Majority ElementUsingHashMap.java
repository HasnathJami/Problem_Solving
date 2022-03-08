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
        
        HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
        
        for(int i=0;i<size;i++)
        {
            if(hm.containsKey(a[i]))
            {
                hm.put(a[i],hm.get(a[i])+1);
            }
            else{
                hm.put(a[i],1);
            }
        }
        
        int maxi=Integer.MIN_VALUE;
        int store=0;
        
        
        for(int i=0;i<size;i++)
        {
            if(hm.get(a[i])>=maxi)
            {
                
                maxi=hm.get(a[i]);
               // System.out.println(maxi);
                store=a[i];
            }
        }
        
        //System.out.println(maxi);
        if(maxi>(size/2)){
            return store;
        }
        
        return -1;
        
    }
}