// { Driver Code Starts
//Initial template for JAVA

import java.lang.*;
import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for JAVA

class Solution2
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String str) {
        // your code here
        HashMap<Character, Integer> hm = new HashMap();
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                hm.put(str.charAt(i), 1);
        }
//
//        System.out.println(hm.size());
//
//        for(Map.Entry m:hm.entrySet())
//        {
//            System.out.println(m.getKey()+" "+m.getValue());
//        }

        if (hm.size() == 26) return true;

        return false;
    }
}

// { Driver Code Starts.

class PangramChecking
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            String s=br.readLine().trim();

            System.out.println(new Solution2().checkPangram (s)==true?1:0);
        }

    }
}  // } Driver Code Ends