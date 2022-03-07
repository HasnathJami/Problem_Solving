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
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    
    int palRecursive(char ch[],int first,int last)
    {
        if(first>=last) return 1;
        
        if(ch[first]!=ch[last]) return 0;
        
        return palRecursive(ch,first+1,last-1);
        
    }
    
    int isPalindrome(String S) {
        // code here
        // char ch[]=S.toCharArray();
        // int first=0;
        // int last=ch.length-1;
        
        // while(first<last)
        // {
        //     if(ch[first]!=ch[last]) return 0;
        //     first++;
        //     last--;
        // }
        
        // return 1;
        
        char ch[]=S.toCharArray();
        return palRecursive(ch,0,ch.length-1);
    }
};