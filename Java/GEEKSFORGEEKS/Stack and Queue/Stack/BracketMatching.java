// { Driver Code Starts

import java.util.*;
import java.lang.*;

class BracketMatching {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Reading total number of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            //reading the string
            String st = sc.next();

            //calling ispar method of Paranthesis class
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if (new Solution2().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");

        }
    }
}// } Driver Code Ends


class Solution2 {
    //Function to check if brackets are balanced or not.

    //Function to check if brackets are balanced or not.
    static boolean ispar(String x) {
        // add your code here

        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '(' || x.charAt(i) == '{' || x.charAt(i) == '[')
                st.push(x.charAt(i));


            else {

                //constraint 2 for this case : ) or ()())
                if (st.isEmpty()) return false;

                //constraint 1 match or not match
                else if ((st.peek() == '(' && x.charAt(i) == ')') || (st.peek() == '{' && x.charAt(i) == '}') || (st.peek() == '[' && x.charAt(i) == ']'))
                    st.pop();

                //constraint 1 match or not match
                else return false;

            }


        }

        //constraint 3 true or false for this case : ()()(  it return false  or if everything is ok then return true
        return st.isEmpty();


    }

}
