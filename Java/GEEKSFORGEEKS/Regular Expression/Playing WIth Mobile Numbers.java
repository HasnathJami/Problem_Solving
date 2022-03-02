// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.is_valid(s);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution
{
    public int is_valid(String s)
    {
        // code here
          if(s.matches("[789][0-9]{9}"))
		    return 1;
		    else if(s.matches("[0][789][0-9]{9}"))
		    return 1;
		    else if(s.matches("[9][1][789][0-9]{9}"))
		    return 1;
		    
		    return 0;
    }
}