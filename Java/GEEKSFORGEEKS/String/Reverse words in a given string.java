// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}
// } Driver Code Ends




class Solution 
{
    //Function to reverse words in a given string.


    
    String reverseWords(String S)
    {
        
        //String store="";
      ////  
        //String words[]=S.split("\\.");
        
       // Stack<String>st=new Stack<String>();
        
        // for(int i=words.length-1;i>=0;i--)
        // {
        //     store+=words[i];
            
            
            
        //     if(i!=0)
        //      store+='.';
            
        // }
        
        // return store;
        
        String store="";
        String words[]=S.split("\\.");
        //Stack<String>st=new Stack<String>();
        ArrayList<String>al=new ArrayList<String>();
        
        for(int i=0;i<words.length;i++)
        {
           // st.push(words[i]);
           al.add(words[i]);
            if(i!=words.length-1)
             // st.push(".");
             al.add(".");
        }
        
        
       // while(!st.isEmpty())
        //{
        //    store=store+st.pop();
       // }
       
      
       
       for(int i=al.size()-1;i>=0;i--)
       {
           store=store+al.get(i);
       }
       
          
        return store;
       
    }
    
    
}