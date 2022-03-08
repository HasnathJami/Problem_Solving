// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
                        
        }
	}
}

// } Driver Code Ends


class Solution {
    
    
    public void permute(int index,String s,List<String>li)
    {
        if(index==s.length())
        {
            
            li.add(s);
            return;
        }
        
        
        for(int i=index;i<s.length();i++)
        {
            s=swap(s,index,i); //for ABC BAC CBA
            permute(index+1,s,li); // ABC-> A(BC)-<ABC etccc
            s=swap(s,index,i); // for backtracking
        }
        
        
        
    }
    
    public String swap(String s,int i,int j)
    {
        char c[]=s.toCharArray();
        char temp=c[i];
        c[i]=c[j];
        c[j]=temp;
        
        return String.valueOf(c);
    }
    
    
    
    
    public List<String> find_permutation(String S) {
        // Code here
        
        List<String> li=new ArrayList<String>();
        
        permute(0,S,li);
        
        Collections.sort(li);
        
        return li;
    }
}