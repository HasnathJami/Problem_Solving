// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
		}
	}
}// } Driver Code Ends


class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
    
          
        Stack<Integer> st = new Stack<Integer>();

        for (int i = 0; i < S.length(); i++) {
            //char c = S.charAt(i);
            if (S.charAt(i) >= '0' && S.charAt(i) <= '9')
            // if(Character.isDigit(c))
            {
                
                st.push(S.charAt(i) - '0');
            } else {

                int store = 0;
                int second = st.pop();
                int first = st.pop();

                if (S.charAt(i) == '+') store = first + second;
                else if (S.charAt(i) == '-') store = first - second;
                else if (S.charAt(i) == '*') store = first * second;
                else store = first / second;

                st.push(store);
            }
        }

        return st.peek();
    }
    
   
}