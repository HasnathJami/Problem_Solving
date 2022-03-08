// { Driver Code Starts
import java.io.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling maxSubarraySum() function
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}

// } Driver Code Ends


class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    
    long max(long a,long b)
    {
        if(a>b) return a;
        return b;
    }
    
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        
        long sum=0;
        long maxi=Long.MIN_VALUE;
        long maxiNeg=Long.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
            
            maxi=max(maxi,sum);
            
            if(sum<0)
            {
                maxiNeg=max(maxiNeg,sum); 
                sum=0;
            }
        }
        
        return max(maxiNeg,maxi);
        
        
        
    }
    
}

