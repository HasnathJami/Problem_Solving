// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}

// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    
    static int max(int a,int b)
    {
        if(a>b) return a;
        return b;
    }
    
    static int min(int a,int b)
    {
        if(a<b) return a;
        return b;
    }
    
    
    static long trappingWater(int arr[], int n) { 
        // Your code here
        
        int left[]=new int[n];
        int right[]=new int[n];
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        int maxi2=Integer.MIN_VALUE;
        long sum=0;
        
        for(int i=0;i<n;i++)
        {
            maxi=max(maxi,arr[i]);
            left[i]=maxi;
        }
        
      //  for(int i=0;i<n;i++)
       // System.out.println(left[i]);
        
         for(int i=n-1;i>=0;i--)
        {
            maxi2=max(maxi2,arr[i]);
            right[i]=maxi2;
        }
        
          // for(int i=0;i<n;i++)
       // System.out.println(right[i]);
        
        
        for(int i=0;i<n;i++)
        {
            mini=min(left[i],right[i]);
            sum+=(mini-arr[i]);
        }
        
        return sum;
    } 
}


