// { Driver Code Starts
import java.util.*;


 // } Driver Code Ends


class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        int maxi=arr[0];
        int mini=arr[0];
        
        if(size==1 && arr[0]!=1)
           return 1;
           
           
        for(int i=1;i<size;i++)
        {
             if(arr[i]>=maxi)
              maxi=arr[i];
              
              if(arr[i]<=mini)
              mini=arr[i];
            
        }
        
        
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<size;i++)
        {
            hs.add(arr[i]);
        }
        
        
        for(int i=mini;i<=maxi;i++)
        {
            if(!hs.contains(i)) {
                
                 if(i>0) return i;
            }
        }
        
         return maxi+1;
        }
       
    }



// { Driver Code Starts.

class Main
{   
    public static void main (String[] args) 
    {

		Scanner sc=new Scanner(System.in);
		
        //taking testcases
		int t=sc.nextInt();
		while(t-->0){
		    
		    //input number n
			int n=sc.nextInt();
			int[] arr=new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
				
			Solution obj = new Solution();
			
			//calling missingNumber()
			int missing = obj.missingNumber(arr,n);
			System.out.println(missing);
		}
    }
}

  // } Driver Code Ends