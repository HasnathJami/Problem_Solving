// { Driver Code Starts
//Initial Template for Java

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
            List<String> ans = ob.AllPossibleStrings(s);
            for(String i: ans)
                System.out.print(i + " ");
            System.out.println();
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public void powerSet(String str,int i,String cur,List<String>l)
    {
       // List <String> l=new ArrayList<String>();
        if(i==str.length()){
            
            l.add(cur);
            return;
            
        }
        
        powerSet(str,i+1,cur+str.charAt(i),l);
        powerSet(str,i+1,cur,l);
        
        
    }
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
        
        List <String> l2= new ArrayList<String>();
        
        powerSet(s,0,"",l2);
        l2.remove(l2.size()-1);
       Collections.sort(l2);
      
        
        return l2;
       
    }
}