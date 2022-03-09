// { Driver Code Starts
import java.io.*;
import java.util.*;

class Array {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		
		while(t-->0){
		    
		    //input size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //inserting elements in the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    StringBuffer str = new StringBuffer();
		    ArrayList<Integer> res = new ArrayList<Integer>();
		  
		    //calling leaders() function
		    res = obj.leaders(arr, n);
		    
		    //appending result to a String
		    for(int i=0; i<res.size(); i++){
		        str.append(res.get(i)+" ");
		    }
		    
		    //printing the String
		    System.out.println(str);
		}
		
	}
}
// } Driver Code Ends


class Solution{
    //Function to find the leaders in the array.
    
    static void reverse(int first,int last,int arr[])
    {
        while(first<last)
        {
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
    }
    
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> al=new ArrayList<Integer>();
        int a[]=new int[n];
      
        int maxi=Integer.MIN_VALUE;  
        int k=0;
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]>=maxi)
               {
                    maxi=arr[i];
                    //al.add(maxi);
                    a[k]=maxi;
                    k++;
               }
              
               
               
        }
        
        reverse(0,k-1,a);
        
        for(int i=0;i<k;i++)
        {
            al.add(a[i]);
        }
        
       
        
       // al=Arrays.asList(a);
        return al;
    }
}
