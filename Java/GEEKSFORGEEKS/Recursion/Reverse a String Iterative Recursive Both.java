// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}// } Driver Code Ends


//User function Template for Java




class Reverse
{
    static void reverse(int first,int last,char s[])
{
    if(first>=last)
     return;
    
   // char c[]=s.toCharArray();
    char temp=s[first];
    s[first]=s[last];
    s[last]=temp;
    
    
    reverse(first+1,last-1,s);
    
}
    
    
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        
        //  int first=0;
        //  int last=str.length()-1;
         
        //  char c[]=str.toCharArray();
         
        //  while(first<=last)
        //  {
        //      char temp=c[first];
        //      c[first]=c[last];
        //      c[last]=temp;
        //      first++;
        //      last--;
        //  }
         
        //  return String.valueOf(c);
        char ch[]=str.toCharArray();
        reverse(0,ch.length-1,ch);
        String store=String.valueOf(ch);
        
        return store;
         
         
         
    }
}