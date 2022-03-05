// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            String result = ob.removeDups(s);
            
            System.out.println(result);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    String removeDups(String S) {
        // code here
        
         HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
         
         for(int i=0;i<S.length();i++)
         {
            char c=S.charAt(i);
             if(hm.containsKey(c))
               hm.put(c,hm.get(c)+1);
             else
             hm.put(c,1);
         }
         
         
         String store="";
         
         for(int i=0;i<S.length();i++)
        {
            if(hm.get(S.charAt(i))>=1 )
            {
                store+=S.charAt(i);
                hm.put(S.charAt(i),0);
            }
           
             
         }
       
      
       
         
         return store;
    }
}